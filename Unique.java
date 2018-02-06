package com.allcorp.policyservice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter 9 integer elements");
		Scanner scan = new Scanner(System.in);
		int[] input = new int[9];
		for (int i = 0; i < 9; i++) {
			input[i] = scan.nextInt();
		}
		Set matchedDatas = new HashSet();
		if (input.length == 9) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j < input.length; j++) {
					if (i == input[j])
						matchedDatas.add(input[j]);
				}
			}
			if (matchedDatas.size() == 9)
				System.out.println("Given array is unique");
			else
				System.out.println("Given array is not unique");
		} else {
			System.out.println("Given array is not unique");
		}
	}
}
