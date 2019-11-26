package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자 야구 게임을 만들어주세요.
		// 3개의 숫자가 겹치지 않게
		//
		int qu1=0;			//랜덤숫자 3개
		int qu2=0;
		int qu3=0;
	
		int re_1= 0;		//입력숫자 3개
		int re_2= 0;
		int re_3= 0;
		int re1 = 0;
		
		int n = 0;
		int strCnt =0;
		int ballCnt =0;
		int outCnt =0;
		
		int total =0;
		int total2 =0;
			/* 랜덤숫자 3개 구하기 */ 
		do{
			qu1 = (int)(Math.random()*9)+1;
			qu2 = (int)(Math.random()*9)+1;
			qu3 = (int)(Math.random()*9)+1;
		}while(qu1 == qu2 || qu1 == qu3 || qu2 == qu3);
		
		Scanner sc = new Scanner(System.in);
		
		total= (qu3*100)+(qu2*10)+qu1;
		System.out.println(total);

	do{
			/* 입력 숫자 3개 입력하기 */
		do{

			 strCnt =0;		//카운트 초기화
			 ballCnt =0;
			 outCnt =0;
			 
			 
			System.out.println("3숫자자리를 입력하시오");
			int re = Integer.parseInt(sc.nextLine());
			
			 re_1 = re % 10;	// 1의 자리 구하기   294 4
			 re1 =re / 10;		//  294 /10 => 29
			 re_2 = re1 % 10;  	// 10의 자리 구하기  29 9
			 re_3 = re1 /10;  	// 29 / 10 => 2
//					total2= (re_3*100)+(re_2*10)+re_1;
			 
		}while(re_1 == re_2 || re_1 == re_3 || re_2 == re_3);
		
			if(qu1 == re_1){
				strCnt++;
			}else if(qu1 == re_2){
				ballCnt++;
			}else if(qu1 == re_3){
				ballCnt++;
			}else{
				outCnt++;
			}
			
			if(qu2 == re_2){
				strCnt++;
			}else if(qu2 == re_1){
				ballCnt++;
			}else if(qu1 == re_3){
				ballCnt++;
			}else{
				outCnt++;
			}
			
			if(qu3 == re_3){
				strCnt++;
			}else if(qu3 == re_1){
				ballCnt++;
			}else if(qu3 == re_2){
				ballCnt++;
			}else{
				outCnt++;
			}	
		System.out.println(strCnt + ":" + ballCnt + ":" + outCnt );
	
		}while(strCnt != 3);
	System.out.println("정답! 집가자");
			
//	}while(strCnt !=3);		

//		 if(qu1 == re_1){
//			 n++;
//			 System.out.println(n+"S");
//			 if(qu1 == re_2);
//		 }else if(qu1 == re_2)
//		 
		
//		
//		int i = Integer.parseInt((sc.nextLine()));
		
		
			
//			//1~100사이 랜덤 수를 발생시킨다.
//			int input = 0;
//			Scanner s = new Scanner(System.in);
//			do{
//				System.out.println("1~100사이의 수를 입력해주세요>");
//				input = Integer.parseInt(s.nextLine());
//				
//				if(answer <input) {
//					System.out.println(input + " 보다 작습니다.");
//				
//				}else if( input < answer){
//					System.out.println(input + " 보다 큽니다.");
//				}else{
//					System.out.println("정답입니다!!");
//				}
//			}while(input != answer);
			
	}

}
