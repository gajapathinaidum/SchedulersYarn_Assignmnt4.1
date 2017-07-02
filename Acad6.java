package com.acadgild.mr.practice;

public class Acad6 {

	//we can overload methods with same return type .below 2 overloaded methods has return type is same.
	public  int sum(int a,int b){
		return a+b;
	}
	public  int sum(int a,int b,int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		Acad6 acad5=new Acad6();
		//sum of 2 numbers method will be called 
		System.out.println(acad5.sum(20, 30));
		//sum of 3 numbers method will be called 
		System.out.println(acad5.sum(20, 30,40));
	}
}
