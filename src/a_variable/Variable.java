package a_variable;

public class Variable {

	 static public void main(String[] args) {
		/*
		 * 	<<변수 >>
		 * 	- 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 *
		 *	<<사용 가능한 기본형 데이터의 종류>>
		 *	- 정수 : byte, short, int, long (숫자의 크기에 따른 분류)
		 *	- 실수 : float, double (정확도를 위해서 사용 double이 더 정확함) 
		 *	- 문자 : char (문자 하나만 표현함)
		 *	- 논리 : boolean (참과 거짓)
		 *
		 *	- byte는 8개의 bit로 이루어져있다.
		 *	- 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *	    그것의 이름이 무엇인지 알려줘야한다.
		 */		
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char ccc;
		short sss;
		int iii;
		long lll;
		float fff;
		double ddd;
		boolean bbb;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(abc); // 컴파일 에러 발생(문법이 틀렸다)
		//변수에 값을 저장하지 않으면 변수의 값으 참조할 수 없다.
		
		// = (대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		abc = 127; // 타입에 맞는 값을 저장해야 한다.
		sss = 30000;
		iii = 20;
		lll = 900L; // long 접미사 : L
		fff = 3.14f; //float 접미사 : f
		ddd = 3.14;	//double 접미사 : d(생략가능)
		ccc = '가';
		bbb = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(iii);
		// Ctrl + F11 : 프로그램 실행
		// F11 : 디버그 모드 실행
		
		iii = 30;
		System.out.println(iii);
		iii = 30 + 40;
		System.out.println(iii);
		iii = sss;
		
		abc = -128;
		sss = 20000;
		iii = 120;
		lll = 3033333333330L;
		fff = 2.222222222222f;
		ddd = 1.55555555555552;
		ccc = '다';
		bbb = false;
		System.out.println(abc);
		System.out.println(sss);
		System.out.println(lll);
		System.out.println(fff);
		System.out.println(ddd);
		System.out.println(ccc);
		System.out.println(bbb);
		
		ccc = '잠';
		System.out.print(ccc);
		ccc = '이';
		System.out.print(ccc);
		ccc = '온';
		System.out.print(ccc);
		ccc = '다';
		System.out.println(ccc);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		/*
		 *  <<리터럴의 종류>>
		 *  숫자 : 0, 10, -5, 3.14
		 *  문자 : '가', 'a', '0',' '
		 *  문자열 : "가나다", "abc", "123"," ", ""
		 *  그외 : true, false, null(값이 없다)
		 *  
		 *  <<참조형 타입>>	
		 *  - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 *  - ex) String, ABC, Variable
		 *  - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 *  - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
		abc = 0;
		sss = 0;
		iii = 0;
		lll = 0L;
		fff = 0.0f;
		ddd = 0.0;
		ccc = '\u0000'; // ' '
		bbb = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		abc = 127;
		iii = 128;
		abc = (byte)iii;	//형변환 : 데이터 타입을 변환하는 것
		System.out.println(abc);	// 128 -> -128 (오버플로우)
		
		abc = -128;
		iii = -129;
		abc = (byte)iii;
		System.out.println(abc); //-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		iii = 232;
		ddd = 13.48312;
		iii = (int)ddd;
		System.out.println(iii);  //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		iii = abc;
		lll = iii;
		ddd = iii;
		ddd = fff;

		/*
		 *	<<상수>>
		 *	- 값을 한번 저장하면 변경할 수 없는 저장공간
		 *	- final int MAX_NUMBER;
		 *	- 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생
	}
}
