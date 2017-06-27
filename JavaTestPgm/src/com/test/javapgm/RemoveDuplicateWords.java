/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

/**
 *
 * @author Mahadev
 */
public class RemoveDuplicateWords
{
 
	public static void main(String args[])
	{
		System.out.println("Input String");
		String input="Welcome to java programming programming to ajmer java delhi goa delhi";
		System.out.println(input);
		countWords(input);
		// a(1);
	}
 
	// static void a(Int id)
	static void countWords(String st)
	{
		// split text to array of words
		String[] words = st.split("\\s");
 
		// clean duplicates
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
						words[i] = "";
 
				}
			}
		}
 
		// show the output
 
		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++)
		{
 
			if (words[i] != "")
			{
				System.out.print(words[i]+" ");
 
			}
		}
	}
}