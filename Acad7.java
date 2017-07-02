package com.acadgild.mr.practice;

import java.util.Arrays;
import java.util.Collections;

public class Acad7 {

	public static void main(String[] args) {
		//sorting Array in descending order
		String[] names={"gaja","yaja","mahi","uday"};
		Arrays.sort(names,Collections.reverseOrder());
		for (String name : names) {
			System.out.println(name);
			}


	}
}
