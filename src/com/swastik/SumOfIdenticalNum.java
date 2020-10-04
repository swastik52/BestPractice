package com.swastik;

import java.io.*; 

public class SumOfIdenticalNum
{ 
	static boolean checkValidPair(int num1, 
								int num2) 
	{ 
		String s1 = Integer.toString(num1); 
		String s2 = Integer.toString(num2); 

		for (int i = 0; i < s1.length(); i++) 
			for (int j = 0; j < s2.length(); j++) 
				if (s1.charAt(i) == s2.charAt(j)) 
					return true; 
		return false; 
	} 
	
	static int countPairs(int []arr, int n) 
	{ 
		int numberOfPairs = 0; 
		for (int i = 0; i < n; i++) 
			for (int j = i + 1; j < n; j++) 
				if (checkValidPair(arr[i], arr[j])) 
					numberOfPairs++; 
	
		return numberOfPairs; 
	} 
	static int addArrayElements(int []arr, int n) 
	{ 
		int addVal = 0; 
		for (int i = 0; i < n; i++) 
			addVal= addVal+arr[i];
	
		return addVal; 
	} 
	public static void main(String args[]) 
	{ 
		int []arr = new int[]{ 10, 22, 33 }; 
		int n = arr.length; 
		if(countPairs(arr, n)>0){
		    System.out.println("contain common digit");
		}
		else{
		    System.out.println(addArrayElements(arr,n));
		}
	} 
} 
