package d_array;												//d_array 패키지다.

import java.util.Arrays;										//java에 utill에서 Arrays를 불러온다.

public class Sort {												//클래스 타입의 Sort 

	public static void main(String[] args) {
		/*
		 * <<정렬>>
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서
		 * 			 작은수와 자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리바꾸기를
		 * 			 반복해 뒤에서부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고
		 * 			 중간에 삽입하는 방식
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른점수들과 비교해 자신의 점수가
		 * 			  작으면 등수를 1씩 증가하는 방식
		 */
		int[] numbers = new int [10];
			

		for(int i =0; i <numbers.length; i++){
				numbers[i] = i + 1;
		}
		shuffle(numbers);										//배열값 랜덤섞기
//		System.out.println(Arrays.toString(numbers));
		
//		selectSort(numbers); 									// 선택정렬
//		System.out.println(Arrays.toString(numbers));
//		bubbleSort(numbers);									//버블정렬
//		intsertSort(numbers);
		printRank(numbers);
//		System.out.println(Arrays.toString(numbers));

	}

	private static void printRank(int[] numbers) {
		//점수(numbers)의 갯수만큼
		//점수만큼 배열 필요
		//초기화 1등 10개등록
		//등수를 저장할 배열생성 <여기에 1을 채워넣기
		//나보더 좋은 점수만나면 +1등
		
		int[] ranks = new int[] {1,1,1,1,1,1,1,1,1,1};
			
		for(int j = 0; j< numbers.length-2; j++){
			if(numbers[j] >numbers[j+1]){
				
			}else{
				break;
			}
		for(int i= 0; i<ranks.length; i++){
			
		}
		}
}

	private static void intsertSort(int[] numbers) {			//삽입정렬
	
		
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for(j=i-1; j>=0; j--){
				if(temp < numbers[j]){
					numbers[j+1] =numbers[j];
				}else{
					break;
				}
			}
			numbers[j+1] = temp;
		}
	
	}
//		int mm =0;
//		for(int i = 1; i <numbers.length-1; i++){
//		//		boolean check = false;
//			mm= numbers[i];
//			for(int j = i-1; j<numbers.length+1; j--){
//					if(numbers[j-1] < mm){
//						numbers[j+1] = numbers[j];
//						numbers[j]	=mm;
//						
//					
//				}
//			}
//		}
	
//}

	private static void bubbleSort(int[] numbers) {				//버블정렬 메소드
		/*
		 * 0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9
		 * 0,1
		 */
	for(int i =0; i<numbers.length -1; i++){
		boolean changed =false;
		
		for(int j = 0; j <numbers.length -i -1; j++){
			if( numbers[j] > numbers[j+1]){
				int k1 = numbers[j];
				numbers[j] = numbers[j+1];
				numbers[j+1] = k1;
				changed = true;
			}
			
		}
		if(!changed){
			break;
		}
	}
		
		
		
		
		
		
//	for (int i = 0; i<numbers.length; i++){
//			System.out.println(numbers[i] + ",");
//	}
//	
//	int cnt=0;
//	for(int i = 0; i < numbers.length; i++){
//		for(int j = 0; j<i-1; j++){
//			 cnt++;
//			if(numbers[j]> numbers[j+1]){
//				int k1 = numbers[j];
//				numbers[j]= numbers[j+1];
//				numbers[j+1] = k1;
//			}
//		}
//	}
//	for(int k=0; k< numbers.length; k++){
//		System.out.println(numbers[k] + ",");
//	}
//	System.out.println( "\n \n 총 회전 수 : " + cnt);
//	
	System.out.println(Arrays.toString(numbers));
}

	private static void selectSort(int[] numbers) {				//선택정렬 메소드
		
		
		for(int i =0; i < numbers.length -1; i++){				//마지막숫자 비교생략 -1
			for(int j =i + 1; j < numbers.length; j++){			//i보다 j가 1더앞에 있으니깐  i+1
				
				if( numbers[i] > numbers[j]){					//배열 순서바꾸기
					int k1 = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = k1;
				}	
			}
		}
		


		}

	private static void shuffle(int[] numbers) {				//랜덤으로 배열값 섞기
		for(int i = 0; i < numbers.length; i++){				
			int random = (int)(Math.random()* numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}

}
