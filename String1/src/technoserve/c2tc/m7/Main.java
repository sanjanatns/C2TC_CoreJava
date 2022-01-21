package technoserve.c2tc.m7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();//radar
		int i=0,j=A.length()-1,flag=0;
		while(i<j)
		{
			if(A.charAt(i)!=A.charAt(j))
			{
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==0)
				System.out.println("Palindrome");
			else
				System.out.println("not Palindrome");			
	}
}
/*
10 5 9 3 1//ascending
5 10 9 3 1
5 9 10 3 1
5 9 3 10 1
5 9 3 1 10->ascending?













*/