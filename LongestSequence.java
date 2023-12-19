package com.mainapp;
import java.util.*;
public class LongestSequence {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int size=n*n;
	int mat[]=new int[size];
	for(int i=0;i<size;i++)
	{
		mat[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		for(int  j=i+1;j<size;j++)
		{
			if(mat[i]>mat[j])
			{
				int temp=mat[i];
				mat[i]=mat[j];
				mat[j]=mat[i];
			}
			
		}
	}
	int old=getArray(mat, size, 0);
	System.out.println(old);
	
	
}
public static int getArray(int[] mat,int size,int old)
{
	for(int i=0;i<size;i++)
	{
		int cnt=0;
	for(int j=i+1;j<size;j++)
	{
		int temp=i;
		if(mat[temp]-mat[j]==1)
		{
			cnt++;
			temp++;
		
		}
		else{
		
				break;
			}
	
	}
	 if(old<cnt)
		 cnt=old;
	
	}
	 return old;
}
}

