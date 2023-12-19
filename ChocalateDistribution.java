package com.mainapp;

import java.util.Scanner;

public class ChocalateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of packets");
		int p=sc.nextInt();
		int[] arr=new int[p];
		
		for(int i=0;i<p;i++)
		{
			System.out.println("Enter No of Chocalate in "+i+" packet");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter No of children");
		int n=sc.nextInt();
		int[] sorted = sort(p, arr);
		int min1 = min(p, n, sorted);
		System.out.println(min1);

	}

	private static int min(int p, int n, int[] sorted) {
		int nmin=sorted[n-1]-sorted[0];
		int omin=nmin;
		for(int i=1;i<p-n;i++)
		{
			nmin =sorted[i+n-1]-sorted[i];
				if(nmin<omin)
					{
						omin=nmin;
						
					}
				return omin;
		}
		return omin;
		 }
		
	

	private static int[] sort(int p, int[] arr) {
		for(int i=0;i<p;i++)
		{
			for(int j=i;j<p;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
