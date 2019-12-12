package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {

	/*
	 * << 인터 페이스>>
	 * -상수와 추상메서드만 멤버로 가질 수 있는 데이터구조이다.
	 * -interface 인터페이스명{}
	 * -모든 멤버변수의 제어자는 public static final 이며, 생략할 수 있다.
	 * -모든 메서드의 제어자는 public abstract 이며, 생략할 수 있다.
	 * - jdk 1.7기준 -
	 * 	단, jdk 1.8부터 static 메서드와 디폴트 메서드 사용가능
	 */

	public static final int NUM1 =1;
	
	int NUM2 =2;
	
	public abstract void method1();
	
	void method2();
	void method5(int j);
}

class SampleImplement implements SampleInterface, SampleInterface2{			//인터페이스는 메서드에 내용이 없기 때문에 메서드명이 중복되어도 구분할 필요가 없다.		
																			//그래서 다중상속이 가능하다.		

	@Override
	public void method1() {
		System.out.println(NUM1);
	}

	@Override
	public void method2() {
		System.out.println(SampleInterface.NUM2);
	}

	@Override
	public void method3() {
		System.out.println();
	}

	@Override
	public void method5(int j) {
		System.out.println();
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
}