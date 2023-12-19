package com.mainapp;
import java.util.*;
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int cnt = 0;
		int flag[]=new int[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			flag[i]=cnt;
			cnt=0;
		}
		int u=0;
		for(int i=0;i<flag.length;i++)
		{
			if(flag[i]==0)
			{
				 u+=1;
			}
		}
		
		System.out.println("Number of unique character"+u);
		

	}

}
