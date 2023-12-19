package com.mainapp;

import java.util.Scanner;

public class Nextpermutation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter");
			arr[i]=sc.nextInt();
		}
		nextPermutation(arr);
		for(int i:arr)
		{
			System.out.print(i);
		}
	}
	public static void nextPermutation(int arr[])
	{
		int n=arr.length,i,j;
		for(i=n-2;i>=0;i--)
		{
			if(arr[i]<arr[i+1])
			{
				break;
			}
		}
		if(i<0)
		{
			reverse(arr,0,n-1);
		}
		else
		{
			for(j=n-1;j<=i;j--)
			{
				if(arr[j]>arr[i])
				{
					break;
				}
			}
			swap(arr,i,j);
			reverse(arr,i+1,n-1);
		}
		
	}
	private static void reverse(int[] arr, int i, int j) {
		while(i<j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
