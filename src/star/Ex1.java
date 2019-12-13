package com.inja.test;

public class Ex1 {
	public static void main(String[] args) {
		for(int k =0; k<100000; k++){
			for(int i =0; i<9; i++){
				for(int j =0; j<9; j++){
					if(i == j){
						System.out.print("★");
					}else if((i+j) == 8){
						System.out.print("★");
					}else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.print("");
		}
	}
	
}

