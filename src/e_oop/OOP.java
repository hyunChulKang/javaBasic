package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {						//static때문에 메모리(heap)영역에 올라가있음.
		/*
		 * << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		new SampleClass(); 											//객체 생성 상태 (메모리 {heap} 영역에 올려진 상태 )
		SampleClass sc =new SampleClass();							//sc라는 변수에  객체가 생성된 주소 즉, 메모리영역에 주소가 등록되있음.
		
		sc.method1();
		
		sc.method2(5);
		
		String returnString = sc.method3();							//String 타입으로 return타입으로 돌려받아서 String 타입의 변수에 저장해서 사용한다.
		System.out.println(returnString);
		
		int reuturnInt = sc.method4(7, 15);
		System.out.println(reuturnInt);
		
		//test1() 호출시 출력되는 문장에서 번호를 붙여주세요.
		sc.test1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
		ClassMarker cm = new ClassMarker();
		//객체가 저장된 변수를 통해 메서드를을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴받는 값을 출력해주세요.
		cm.numbers();
		
		int m = cm.numbers2();
		System.out.println(m);
		
		cm.numbers3(3);
		
		int v= cm.numbers4(4,5);
		System.out.println(v);
		Calculator cal =new Calculator();
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		
		double value = cal.thehagi(123456, 654321);				//1. 123456 +654321
			 value = cal.gopagi(value,123456);					//2. 1번의 결과값 * 123456 
			 value = cal.nanugi(value, 123456);					//3. 2번의 결과값 / 123456
			 value = cal.bbegi(value, 654321);					//4. 3번의 결과값 - 654321
			 value = cal.nameji(value, 123456);					//5. 4번의 결과값 % 123456
			 System.out.println(value);
			 
//			 Scanner sct = new Scanner(System.in);
			 
//			 double num = Integer.parseInt(sct.nextLine());						//휴대폰번호 & 만 나이 알기
//			 double values =cal.gopagi(num, 2);
//			 System.out.println(values);
//			 values=cal.thehagi(values, 5);
//			 System.out.println(values);
//			 values=cal.gopagi(values, 50);
//			 System.out.println(values);
//			 values=cal.thehagi(values, 1766);
//			 System.out.println(values);
//			 System.out.println("지금까지 나온 숫자에서 당신의 태어난 년도를 4자리를 뻅니다.");
//			 num = Integer.parseInt(sct.nextLine());
//			 System.out.println(values-num);
			 
	}
		
}