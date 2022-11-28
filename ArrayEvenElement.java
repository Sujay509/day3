package com.bridgelabz.day3;

import java.util.Scanner;

public class ArrayEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++)
		{
			if(i % 2 == 0)
			System.out.println("Even Positioned Elements: "+numbers[i]);
		}
          sc.close();
	}

}
