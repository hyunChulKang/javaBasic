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
		
//		String St[] = new String [21];
//		 St[0]  ="김지선"; 
//		 St[1]  ="이누리";
//		 St[2]  ="박종민";
//		 St[3]  ="정대석";
//		 St[4]  ="정재영";
//		 St[5]  ="강현철";
//		 St[6]  ="주향한";
//		 St[7]  ="윤창훈";
//		 St[8]  ="연은주";
//		 St[9]  ="김령환";
//		 St[10]  ="구한나";
//		 St[11]  ="백종빈";
//		 St[12]  ="이병훈";
//		 St[13]  ="강현지";
//		 St[14]  ="김경운";
//		 St[15]  ="이지형";
//		 St[16]  ="이예림";
//		 St[17]  ="이승재";
//		 St[18]  ="민태홍";
//		 St[19]  ="엘사";
//		 St[20]  ="안나";
//		 
//		 String [] St_sort = new String [21];
//		 int randN [][] = new int [21][6];
//		 int randN_sort[][] = new int [21][6];
//		 int[] sum =new int[randN.length]; 								
//		 int[] sum_sort = new int[21];
//		 double[] avg = new double [randN.length];
//		 double[] avg_sort = new double [21];
//		 int[] ranks = new int [21];
//		 int[] temp = new int[6];
//		 System.out.println("석차" +"\t"+ "이름" +"\t"+ "Java" +"\t"+ "Oracle" +"\t"+ "HTML" +"\t"+ "CSS" +"\t"+ "JQuery" +"\t"+ "jsp"+"\t"+ "총점"+"\t"+"평균");
//		 
//		 
//		 for(int i = 0; i< randN.length; i++){								//랜덤점수
//			 for(int j = 0; j <randN[i].length; j++){
//				 randN[i][j]= (int)(Math.random() * 50 )+51;				 	
//				 sum[i] += randN[i][j]; 
//			 }
//			 avg[i] += sum[i] / randN[i].length;
//		 }
//		 
//		 for(int i = 0; i< avg.length; i++){
//			 for(int j = 0; j < avg.length; j++){
//				 if(sum[i]<sum[j]){
//					 ranks[i]++;
//				 }else if( sum[i] < sum[j]){
//					 if(i>j) ranks[i]++;
//				 }
//			 }
//		 }
//		 
//		 for(int i = 0; i<randN.length; i++){
//			 St_sort[ranks[i]] = St[i];
//			 sum_sort[ranks[i]] = sum[i];
//			 avg_sort[ranks[i]] = avg[i];
//			 for(int j=0; j< randN[i].length;j++){
//				 randN_sort[ranks[i]][j] = randN[i][j];
//			 }
//
		 
//			for(int i = 0; i<randN.length; i++){							//총합, 평균 구하기
//				System.out.print(ranks[i]+"\t");
//				System.out.printf(St[i]+"\t");
//				for(int j= 0; j<randN[6].length; j++){
//					sum[i] += randN[i][j];
//					System.out.print(randN[i][j]+"\t");
//				}
//				avg[i] = (int)(sum[i]) / randN[i].length;
//					System.out.println(sum[i]+"\t"+ avg[i]);
//					
//			}
//			for(int i = 0; i <temp.length; i++){
//				for(int j= i+1; j<temp.length; j++){
//					if (sum[i]>sum[j]){
//						for(int k = 0; k <temp.length; k++){
//							temp[k] = sum[i][j];
//						}
//					}
//				}
//			}
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
//		 System.out.println();
//		 for(int i = 0; i<randN.length; i++){
//			 int j = 0;
//			 if(sum_sort[i] == sum_sort[i] || avg_sort[i] == avg_sort[i]){
//				 System.out.print(i+1 +"\t" + St_sort[i] + "\t"+ randN_sort[i][j] + "\t"
//						 + randN_sort[i][j+1] + "\t"+ randN_sort[i][j+2] + "\t"+ randN_sort[i][j+3] + "\t"
//						 + randN_sort[i][4] + "\t"+ randN_sort[i][j+5] + "\t"+ sum_sort[i] + "\t" + avg_sort[i]);
//			 System.out.println();
//			 }
//		 }
//	
		String[] students = {"정대성", "박종민", "이누리", "김지선"};
		String[] subjects = {"Java","Oracle","HTML","JQuery","Jsp"};
		double [][] scores = new double[students.length][subjects.length+3];	//총점 석차 평균만들기위해 +3
				
		//점수 입력한다.
			for(int i = 0; i < scores.length; i++){
				scores[i][0] = 1; //석차
				for(int j=0; j <subjects.length; j++){
					scores[i][j+1] = (int)(Math.random() *51) +50;
					
				}
			}
		//총점과 평균을 구한다.
		for (int i = 0; i <scores.length; i++){
			for (int j = 0; j<subjects.length; j++){
				scores[i][scores[i].length-2]
						+= scores[i][j+1]; //총점
				
			}
			scores[i][scores[i].length -1]
					= (int)(scores[i][scores[i].length - 2]
							/ subjects.length * 100+ 0.5)
							/ 100.0; //평균
		}
		//석차를 구한다.
		for(int i = 0; i <scores.length-1 ; i++){
			for(int j = 0; j <scores.length; j++){
				if(scores[i][scores[j].length -1]
						< scores[j][scores[j].length - 1]){
					scores[i][0]++;
				}
			}
		}
		//정렬한다.
		for(int i = 0; i <scores.length ; i++){
			for(int j = i + 1; j <scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
			//출력한다.
			System.out.print("석차\t이름");
		for(int i =0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
			System.out.println("\t총점\t평균");
		
			for(int i =0; i< scores.length; i++){
				System.out.print((int)scores[i][0]+ "\t" + students[i]);
			
				for(int j= 1; j<scores[i].length; j++){
					System.out.print("\t" + scores[i][j]);
				}	
					System.out.println();
			}
			
			System.out.println("과목별 평균");
			for(int i = 1; i <= subjects.length; i++){
				double sum = 0;
				for(int j= 0; j< scores.length; j++){
					sum += scores[j][i];
				}
				double avg = (int)(sum / scores.length * 100 + 0.5)
						/100.0;
					System.out.print("\t" + avg);
			}
			
			
	}
}
