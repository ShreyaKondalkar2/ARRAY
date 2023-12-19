package com.mainapp;

import java.util.Scanner;

public class BestTimeBuynSell {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,min,max;
		for(i=0;i<n;i++)
		{
			System.out.println("enter");
			arr[i]=sc.nextInt();
		}
		min=min(arr);
		int j=indexof(arr, min);
		if(j==n-1)
		{
			System.out.println(0);
		}
		else {
			max=max(arr,j);
			int k=indexof(arr, max);
			System.out.println(max);
			System.out.println(k+1);
		}
		
	}
	public static int min(int arr[]) {
		int min=99999;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
		
	}
	public static int max(int arr[],int j) {
		int max=0;
		for(int i=j;i<=arr.length-1;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
		
	}
	public static int indexof(int arr[],int a)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				return i;
			}
		}
		return -1;
		
	}

}
