package com.bridgelabz.day3;

import java.util.*;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" Elements");
			for(int i=0; i<arr.length; i++)
			{
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("Sorted Elements are: ");
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
           
			
			sc.close();
	}

}
