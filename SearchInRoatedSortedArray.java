package com.mainapp;

import java.util.Scanner;

public class SearchInRoatedSortedArray {
	public static void main(String args[])
	{
		int[] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Value");
			arr[i]=sc.nextInt();
		}
		System.out.println("Eneter No to search");
		int n=sc.nextInt();
		int in = search(arr, n);
		if(in==0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(in);
		}
		
		
	}

	private static int search(int[] arr, int n) {
		for(int i=0;i<5;i++)
		{
			if(arr[i]==n)
			{
				return i;
				
				}
			
	 	
		}
		return 0;
	}
}
