package d_array;

import java.util.Scanner;

public class SimLitTest {

	String vaule ="";
	Scanner sc =new Scanner (System.in);
	String []type = {"나는 금사빠다(Y/N)","연애할 떄 끌려다니는 타입이다.(Y/N)","데이트 코스는 미리 짜는게 편하다.(Y/N)","감정기복이 크지않다.(Y/N)"
					,"감정표현이 솔직한 편이다.(Y/N)","활동적인 데이트가 좋다.(Y/N)","연락이 없어도 믿고 기다리는 편이다.(Y/N)","이성친구는 존재할 수 없다.(Y/N)",
					"아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(Y/N)"
					};
	public static void main(String[] args) {
		new SimLitTest().question1();
	}
	
	void question1(){
		System.out.println(type[0]);
			vaule = sc.nextLine();
		if(vaule.equals("Y") || vaule.equals("y")){
			question2();
		}else if(vaule.equals("N")|| vaule.equals("n")){
			question4();
		}else{
			System.out.println("다시입력해주세요");
			question1();
		}
	}

	void question2(){
		System.out.println(type[1]);
			vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
			System.out.println("");
				question5();
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question3();
		}else{
			System.out.println("다시입력해주세요");
			question2();
		}
	}

	void question3(){
		System.out.println(type[2]);
			vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
				question6();
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question5();
		}else{
			System.out.println("다시입력해주세요");
			question3();
		}
	}

	void question4(){
		System.out.println(type[3]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
				question7();
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question5();
		}else{
			System.out.println("다시입력해주세요");
			question4();
		}
	}
	
	void question5(){
		System.out.println(type[4]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
				question8();
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question6();
		}else{
			System.out.println("다시입력해주세요");
			question5();
		}
	}
	
	void question6(){
		System.out.println(type[5]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
				question8();
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question9();
		}else{
			System.out.println("다시입력해주세요");
			question6();
		}
	}
	
	void question7(){
		System.out.println(type[6]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
			System.out.println("당신의 타입은 A 타입입니다");
		}else if(vaule.equals("N")|| vaule.equals("n")){
				question4();
		}else{
			System.out.println("다시입력해주세요");
			question7();
		}
		
	}
	
	void question8(){
		System.out.println(type[7]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
				question2();
		}else if(vaule.equals("N")|| vaule.equals("n")){
			System.out.println("당신의 타입은 B 타입입니다");
		}else{
			System.out.println("다시입력해주세요");
			question8();
		}
	}
	
	void question9(){
		System.out.println(type[8]);
		vaule = sc.nextLine();
		if(vaule.equals("Y")|| vaule.equals("y")){
			System.out.println("당신의 타입은 D 타입입니다");
		}else if(vaule.equals("N")|| vaule.equals("n")){
			System.out.println("당신의 타입은 C 타입입니다");
		}else{
			System.out.println("다시입력해주세요");
			question9();
		}
	}
}
