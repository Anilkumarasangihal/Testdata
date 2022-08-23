package com.practicePrograms;

import java.util.Scanner;

public class swaping2 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the 1st value");
	int a=sc.nextInt();//5
	System.out.println("enter the 2nd value");
	int b=sc.nextInt();//10
	System.out.println("before swaping "+a+" "+b);
	a=a*b;//5*10=50
	b=a/b;//50/10=5
	a=a/b;//50/5=10
	System.out.println("after swaping "+a+" "+b);
	
}
}
