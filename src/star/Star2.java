package com.inja.test;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력");
//		int 9 = Integer.parseInt((sc.nextLine()));
		
		for(int i =0; i<9; i++){
			for(int j=0; j<9; j++){
				if(i<=9/2){
					if(i+j<=9/2-1){					//중간기준 삼각형
						System.out.print(" ");
					}else if(j-i>= 9/2+1){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else if(i>9/2){						//중간 기준 역삼각형
					
					if(i-j>=9/2+1){
						System.out.print(" ");
					}else if(i+j>=9/2*3+1){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
	}
}