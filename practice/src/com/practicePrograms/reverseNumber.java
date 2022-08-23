package com.practicePrograms;

import java.util.Scanner;

public class reverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();//145 
	int sum=0;//5 54
	if(num!=0)//14 1
	{
		int a=num%10;//5 4
		sum =(sum*10)+a;//5 54 541
		num=num/10;//14 1
		System.out.println(sum);
	}
	
	
}
}
