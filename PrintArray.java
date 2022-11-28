package com.bridgelabz.day3;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array: ");	
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.print("array Elemets: "+arr[i]+" " );
		}
		
		sc.close();
	}

}
