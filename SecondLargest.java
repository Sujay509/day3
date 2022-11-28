package com.bridgelabz.day3;

import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		int len = num.length;
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i<len; i++)
		{
			num[i]=sc.nextInt();
		} 
		Arrays.sort(num);
		System.out.println("Sorted Elements: ");
		for(int i=0; i<len; i++)
		{
			System.out.println(num[i]);
		} 
		System.out.println("2nd Largest: "+num[len-2]);
		
		sc.close();

	}

}
