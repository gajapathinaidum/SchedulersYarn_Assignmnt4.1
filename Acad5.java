package com.acadgild.mr.practice;

public class Acad5 {

	//sum() is overloaded method with same method signature and different parameters list
	public  void sum(int a,int b){
		System.out.println("Sum of 2 numbers is"+(a+b));
	}
	public  void sum(int a,int b,int c){
		System.out.println("Sum of 3 numbers is"+(a+b+c));
	}
	public static void main(String[] args) {
		Acad5 acad5=new Acad5();
		//sum of 2 numbers method will be called 
		acad5.sum(20, 30);
		//sum of 3 numbers method will be called 
		acad5.sum(20, 30,40);
	}
}
