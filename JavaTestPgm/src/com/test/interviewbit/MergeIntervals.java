package com.test.interviewbit;

import java.util.ArrayList;

public class MergeIntervals {

    public static void main(String[] args) {
        ArrayList<Interval> interval = new ArrayList<Interval>();
        interval.add(new Interval(1, 2));
        interval.add(new Interval(3, 6));

        System.out.println(insert(interval, new Interval(8,10)));

    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> output = new ArrayList<>();
        boolean merged = false;

        if (intervals.size() == 0) {
            output.add(newInterval);
            return output;
        }

        for (Interval input : intervals) {
            if (input.start <= newInterval.start && input.end >= newInterval.end) {
                merged = true;
                break;
            }
            if (input.end < newInterval.start) {
                continue;
            }

            if (input.end >= newInterval.start && input.start < newInterval.start) {
                input.end = newInterval.end;
                merged = true;
                break;
            }
        }

        boolean added = false;
        if (!merged) {
            for (int i = 0; i < intervals.size(); i++) {
                if (intervals.get(i).start < newInterval.start) {
                    output.add(intervals.get(i));
                    continue;
                }
                output.add(newInterval);
                added = true;
                for (; i < intervals.size(); i++) {
                    output.add(intervals.get(i));
                }
                break;
            }
            if(!added) {
                output.add(newInterval);
            }
            intervals = output;
        }

        for (int i = 0; i < intervals.size() - 1;) {
            Interval one = intervals.get(i);
            Interval two = intervals.get(i + 1);

            if (one.start <= two.start && one.end >= two.end) {
                intervals.remove(i + 1);
            } else if (one.end < two.start) {
                i++;
            } else if (one.end >= two.start) {
                one.end = two.end;
                intervals.remove(i + 1);
            }
        }
        return intervals;
    }
}
