package com.swastik;

import java.util.Scanner;

/*
 * find the sum of sub array with given sum in side an array
 * Swastik 
 * Dt-23/09/20
 */

public class SubArrayWithGivenSum {

	public static Scanner in=new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter the size of array and Sum");
		int size= in.nextInt();
		int sum = in.nextInt();
		int[] num= new int[size];
		System.out.println("Enter the array elements");
	    for (int i=0;i<size;i++){
	        num[i]=in.nextInt();
	    }
	    if (num.length>0) {
	    	findSubArray(num ,sum);
	    }
	}
	
	
	private int findSubArray(int[] num,int sum) {
		int curr_sum=0,i=0;
        for (i=0;i<num.length;i++){
            curr_sum=num[i];
            for(int j=i+1;j<num.length+1;j++){
                if (curr_sum==sum){
                    int pos=j-1;
                    System.out.println(num[i]+ " "+num[pos]);
                    return 1;
                } if(curr_sum>sum || j==num.length){
                    break;
                }
                curr_sum= curr_sum+num[j];
            }
        }
		return 0;
		
	}


	public static void main(String[] args) {
		
		
		//	System.out.println("Enter the test case");
		int tc=in.nextInt();
		SubArrayWithGivenSum obj= new SubArrayWithGivenSum();
		while(tc>=0) {
			obj.input();
		} 
	}

}
