package com.acadgild.mr.practice;

public class Acad3 {

	public static void findOddEvenBetween(int a,int b){
		for(int i=a;i<=b;i++){
		if(i%2==0)
		System.out.println("even Number is  "+i);
		else
		System.out.println("odd Number is  "+i);
	}}
	public static void main(String[] args) {
		findOddEvenBetween(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
	}
}
