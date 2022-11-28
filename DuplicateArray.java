package com.bridgelabz.day3;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
	        int[] arr = new int[size];
		System.out.println("Enter "+size+" Numbers: "); 
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
	        System.out.println("Duplicate elements in given array: ");  
	        for(int i = 0; i < arr.length; i++) 
		{  
	            for(int j = i + 1; j < arr.length; j++) 
	            {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);
			
	            }          
			
	    }
              sc.close();

	}

}
