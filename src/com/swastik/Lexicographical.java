package com.swastik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*You are given Q queries and every query ‘q’ a range is given i.e [L,R] and you have to print 
frequently occurring character in that range for every query. If in case there are two or more than 
two characters with equal frequency in that range you have to print the character in lexicographical 
order otherwise you have to print the character with maximum frequency.*/

//Dt-27-09-20
//Developed by Swastik

public class Lexicographical {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number of Queries");
		int query=br.read();
		String[] queries= new String[query];
		while(query>0) {
			 System.out.println("Enter the String in each query");
		     queries[i] = br.readLine();   
		}
	}

	

}
