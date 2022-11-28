package com.bridgelabz.day3;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,34,123,874,5,43,13};
		int min = arr[0];
		System.out.println("Array Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min=arr[i];
		}
		System.out.println("\nSmallest Element: "+ min);

	}

}
