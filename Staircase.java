package com.allcorp.policyservice;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter staircase size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		System.out.println("Right aligned staircase with an size "+ size);
		for(int j =0;j<size;j++){
		for(int i =0 ; i< size;i++){
			int d = j+i;
			if(d>=(size-1))
				System.out.print("#");
			else
				System.out.print(" ");
		}
		System.out.println();
		}
		System.out.println("Left aligned staircase with an size "+ size);
		for(int j =size;j>0;j--){
		for(int i =0 ; i<size;i++){
			int d = j+i;
			if(d<=(size))
				System.out.print("#");
			else
				System.out.print(" ");
		}
		System.out.println();
		}
		
	}

}
