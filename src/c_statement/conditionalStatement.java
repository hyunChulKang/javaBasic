package c_statement;

import java.util.Scanner;

public class conditionalStatement {

	public static void main(String[] args) {
		/*
		 *  << if문 >>
		 *  -if : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 *  -else if : 다수의 조건이 필요할때 if 뒤에 추가한다.
		 *  -else : 결과가 true인 조건이 하나도 없는 경우를 위해 추가한다.
		 *  
		 */
		
		int a = 10;
		
		if(a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a < 10) {
			System.out.println("조건식의 연산결과 false이면 수행되지 않는다.");
		}
		
		int regNo = 5; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1 ) {
			gender = "남자";
		}else if(regNo == 2){ //if 블러뒤 뒤에 else if로 추가 할 수 있다.
			gender = "여자";
		}else if(regNo == 3){
			gender = "남자";
		}else if (regNo == 4){
			gender = "여자";
		}else{
			gender = "확인 불가";
		}
		System.out.println("당신의 성별은 "+ gender + " 입니다.");
	
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
	
		if(regNo == 1 || regNo == 3 ) 
			gender = "남자";
		else if(regNo == 2 || regNo == 4) //if 블러뒤 뒤에 else if로 추가 할 수 있다.
			gender = "여자";
		else
			gender = "확인 불가";
		
		System.out.println("당신의 성별은 "+ gender + " 입니다.");
			
////////////////////////////성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 78;
		String grade = null;
		
		if(90 <= score){	//90이하
			grade = "A";
		}else if (80 <= score && score <90){ //80이하
			grade = "B";
		}else if(70 <= score){	//70이하
			grade = "C";
		}else if(60 <= score){	//60이하
			grade = "D";
		}else{	//그외
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		//등급 안에서 +와 -를 나누어보자.
		
		score = 78;
		grade = null;
		
		if(90 <= score) {	//90이하
			grade = "A";
			if(97<=score){	//97이상
				grade += "+";
			}else if(score <= 93){ //93이하
				grade += "-";
			}
			
		}else if(80 <= score){	//80이하
			grade = "B";
			if(87<= score){	//87이상
				grade += "+";
			}else if(score <= 83){	//83이하
				grade += "-";
			}
			
		}else if(70 <= score){	//70이하
			grade = "C";
			if(77<= score){	//77이상
				grade += "+";
			}else if(score <= 73){	//73이하
				grade += "-";
			}
			
		}else if(60 <= score){	//60이하
			grade = "D";
			if(67<= score){	//67이상
				grade += "+";
			}else if(score <= 63){	//63이하
				grade += "-";
			}
			
		}else{		//그외 
			grade ="F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");

		/*
		 *  << switch문 >>
		 *  -조건식과 일치하는 case문 이후의 문장을 수행한다.
		 *  -조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 */
		
		regNo = 2;
		gender = null;
		
		switch(regNo){	//조건식의 연산결과는 정수와 문자열만 허용한다.
		
			case 1 : case 3 :	//case문의 값은 리터럴과 상수만 사용할 수 있다.
					gender ="남자";
					break;	//break를 만나면 switch문을 빠져나간다.
			case 2 : case 4 :
					gender ="여자";
					break;
			default:
					gender ="확인 불가";
		}
		System.out.println("당신의 성별은 "+ gender + " 입니다.");
		
		score = 82;
		grade =null;
		
		switch(score/10){
		
			case 10 :case 9 :	//100점,90점
				grade = "A";
				break;
			case 8 :	//80점
				grade = "B";
				break;
			case 7 :	//70점
				grade =	"C";
				break;
			case 6 :	//60점
				grade =	"D";
				break;
			default:	//그외
				grade =	"F";
		}
		System.out.println(score + " 점은 " + grade + " 입니다.");
		
		//////////////////////////////콘솔창에서 입력받는 방법
		Scanner s =new Scanner(System.in);
//		
//		System.out.println("문자열을 입력해주세요>");
//		String input1 = s.nextLine(); //사용자에게 입력받은 문자열을 반환한다.
//		System.out.println("입력받은 문자열 : " + input1);
//		
//		
//		System.out.println("숫자를 입력해주세요");
////		s.nextInt(); //버그가 있기 때문에 사용하지 말자!!
//		int input2 =Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자는 : " + input2);
//		
//		//////////////////////////문자열을 입력받고 입력받은 문자열을 출력해주세요.
//		
//		System.out.println("문자 입력하시오");
//		String input3 = s.nextLine();
//		System.out.println("입력하신 문자는 : "+ input3 + " 입니다");
//		
//		System.out.println("숫자를 입력하시오");
//		int input4 = Integer.parseInt(s.nextLine());
//		System.out.println("입력하신 숫자는 :" + input4 + " 입니다" );
		
		//숫자를 입력받아 그 숫자가 0인지 0이 안니지 출력해주세요
		
//		System.out.println("숫자를 입력하세요>");
//		
//		int num = Integer.parseInt(s.nextLine());
//		
//			if(num == 0){
//				System.out.println("입력하신 숫자는 0이 맞습니다.");				
//			}else{
//				System.out.println("입력하신 숫자는 0이 아닙니다.");
//			}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요
//		
//		System.out.println("숫자를 입력하시오>");
//		
//		int num = Integer.parseInt(s.nextLine());
//		
//			if(num%2==0){
//				System.out.println("짝수");
//			}else{
//				System.out.println("홀수");
//			}
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요
			System.out.println("첫번째 점수는 : ");
			int num1 = Integer.parseInt(s.nextLine());
		
			System.out.println("두번째 점수는 : ");
			int num2 = Integer.parseInt(s.nextLine());
			
			System.out.println("세번째 점수는 : ");
			int num3 = Integer.parseInt(s.nextLine());
			
			grade =null;
			int sum = num1 + num2 + num3;
			int num10 = sum/3;
		
				
			if(90 <= num10) {	//90이하
				grade = "A";
				if(97<=num10){	//97이상
					grade += "+";
				}else if(num10 <= 93){ //93이하
					grade += "-";
				}
				
			}else if(80 <= num10){	//80이하
				grade = "B";
				if(87<= num10){	//87이상
					grade += "+";
				}else if(num10 <= 83){	//83이하
					grade += "-";
				}
				
			}else if(70 <= num10){	//70이하
				grade = "C";
				if(77<= num10){	//77이상
					grade += "+";
				}else if(num10 <= 73){	//73이하
					grade += "-";
				}
				
			}else if(60 <= num10){	//60이하
				grade = "D";
				if(67<= num10){	//67이상
					grade += "+";
				}else if(num10 <= 63){	//63이하
					grade += "-";
				}
				
			}else{		//그외 
				grade ="F";
			}
			System.out.println("총점은 : "+ sum +" 이고 " + " 평균은 "	+ ""+ num10 +" 등급은 " + grade + " 입니다");
			
	}
	

}
