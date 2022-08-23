package com.practicePrograms;

import java.util.Scanner;

public class swapwithout3rdvariable {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the first value");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd value");
	int b=sc.nextInt();
	System.out.println("Before swap "+a+" "+b);
	a=a+b;// 20+30=50
	b=a-b;// 50-30=20
	a=a-b;//50-20=30
	System.out.println("After swaping "+a+" "+b);
	
	
}
}
