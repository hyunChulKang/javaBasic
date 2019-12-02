package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Orcale, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 범수, 총점, 평균을 출력해주세요.
		 * 
		 * 순위 	이름		Java	Oracle	HTML	CSS	JQuery	JSP	총점	평균
		 * 1	홍길동	90		100		80		50	30		90	400	70
		 * 2	홍길동	90		100		80		50	30		90	400	70
		 * 3	홍길동	90		100		80		50	30		90	400	70
		 * 4	홍길동	90		100		80		50	30		90	400	70
		 * 5	홍길동	90		100		80		50	30		90	400	70
		 *
		 */
		
		String St[] = new String [21];
		 St[0]  ="김지선"; 
		 St[1]  ="이누리";
		 St[2]  ="박종민";
		 St[3]  ="정대석";
		 St[4]  ="정재영";
		 St[5]  ="강현철";
		 St[6]  ="주향한";
		 St[7]  ="윤창훈";
		 St[8]  ="연은주";
		 St[9]  ="김령환";
		 St[10]  ="구한나";
		 St[11]  ="백종빈";
		 St[12]  ="이병훈";
		 St[13]  ="강현지";
		 St[14]  ="김경운";
		 St[15]  ="이지형";
		 St[16]  ="이예림";
		 St[17]  ="이승재";
		 St[18]  ="민태홍";
		 St[19]  ="엘사";
		 St[20]  ="안나";
		 
		 int randN [][] = new int [21][5];
		 int[] sum =new int[randN.length]; 								
		 int[] avg = new int [randN.length]; 	
		 int[] ranks = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				 1}; 
		 System.out.println("석차" +"\t"+ "이름" +"\t"+ "Java" +"\t"+ "Oracle" +"\t"+ "HTML" +"\t"+ "CSS" +"\t"+ "JQuery" +"\t"+ "총점"+"\t"+"평균");
		 
		 
		 for(int i = 0; i< randN.length; i++){								//랜덤점수
			 for(int j = 0; j <randN[i].length; j++){
				 randN[i][j]= (int)(Math.random() * 50 )+51;				 	
			 }
//			 System.out.println(Arrays.toString(randN[i]));
		 }
			for(int i = 0; i<randN.length; i++){							//총합, 평균 구하기
				System.out.print(ranks[i]+"\t");
				System.out.printf(St[i]+"\t");
				
				for(int j= 0; j<randN[6].length; j++){
					sum[i] += randN[i][j];
					System.out.print(randN[i][j]+"\t");
				}
//				if(sum[i]>sum ){
//					
//				
//					for(int i =0; i < randN.length -1; i++){				//마지막숫자 비교생략 -1
//						
//						for(int j =0; j < randN.length; j++){				//i보다 j가 1더앞에 있으니깐  i+1
//							if(randN[i]  > randN[j]){						//배열 순서바꾸기
//								int[] k1 = randN[i];
//								randN[i] = randN[j];
//								randN[j] = k1;
//							}	
//						}
//					}
//				}
				avg[i] = (int)(sum[i]) / randN[i].length;
					System.out.println(sum[i]+"\t"+ avg[i]);
					
			}
//				System.out.println(avg[i]);
//				System.out.println(sum[i]);
//			for(int i = 0; i <randN.length; i++){							//석차
//					int j=0;
//				for( j = 0; j<randN[i].length; j++){
//						
//					if(sum[i] < sum[j]){
//							ranks[i] ++;
//					}
//				}
//				System.out.println(sum[i]);
//			}
//			
//			for(int i = 0; i<randN.length; i++){
//				for(int j = 0; j<randN.length; j++){
//				}
//			}
//			
//			for(int i =0; i < randN.length -1; i++){						//마지막숫자 비교생략 -1
//				
//				for(int j =0; j < randN.length; j++){			//i보다 j가 1더앞에 있으니깐  i+1
//					if(randN[i]  > randN[j]){					//배열 순서바꾸기
//						int[] k1 = randN[i];
//						randN[i] = randN[j];
//						randN[j] = k1;
//					}	
//				}
//			}
//			for (int i = 0; i< St.length; i++){
//					for(int j = 0; j<randN.length; j++){
//					System.out.println(randN[i][j]);
//					}	
//					System.out.println("\t"+St[i]+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+ sum[i]  +"\t"+ avg[i] );
//			}
//			
//			 System.out.println(pn);
	}

}
