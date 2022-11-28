package com.bridgelabz.day3;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("greater: "+max);
		
		sc.close();
	}

}
