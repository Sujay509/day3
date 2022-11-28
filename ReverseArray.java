package com.bridgelabz.day3;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter Array elements: ");
		for(int i=0; i<size; i++)
		{
			numbers[i] = sc.nextInt();
		}
		System.out.println("Reversed Array Elements:");
		for(int i=size-1; i>=0; i--)
		{
			System.out.print(numbers[i]+" ");
		}
		
		sc.close();
	}

}
