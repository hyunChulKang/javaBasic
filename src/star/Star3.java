package com.inja.test;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오");
		int num = (Integer.parseInt(sc.nextLine()));
		for(int i=0; i<num+1; i++){
			for(int j=num; j>0; j--){
				if(j>i+1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				System.out.print(" ");
			}
			for(int j=i; j<num; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
