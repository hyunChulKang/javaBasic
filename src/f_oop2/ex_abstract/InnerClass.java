package f_oop2.ex_abstract;

public class InnerClass {

	public static void main(String[] args) {

		/*
		 *  << 내부 클래스 >>
		 *  - 클래스 내부에서 선언된 클래스이다.
		 *  - 선언된 위치와 형태에 따라 여러가지로 나누어진단.
		 *  - 인스턴스 클래스 	: 멤버변수 선언위치에 선언하며, 인스턴스 멤버들과 관련된
		 *  - static 클래스 	: static이 붙고 멤버변수 선언위치에 선언하며, static 멤버들과 관련된 작업에 사용된다.
		 *  - 지역 클래스 		: 메서드나 초기화 불럭안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다.
		 *  - 익명 클래스	 	: 이름이 없고, 선언과 객체 생성을 동시에 한다.(일회용)
		 */
		
		Outer.InstanceInner ii =new Outer().new InstanceInner();
		System.out.println(ii.inner1);
		
		System.out.println(Outer.StaticInner.inner3);
		
		Outer.StaticInner si =new Outer.StaticInner();
		System.out.println(si.inner2);
	}

}

class Outer{

	int instanceVar = 1;									//인스턴스 변수
	int var = 10;
	

	static int classvar = 2;								//클래스 변수
	
	
	class InstanceInner{									//인스턴스 클래스
	// 인스턴스 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능
		int inner1 =instanceVar;
		int inner2 = classvar;
		int var =20;
		
		void method(){
			int var = 30;
			
			System.out.println(var);						//메서드 안에 있는 지역변수
			System.out.println(this.var);					//인스턴스 클래스 안에 있는 인스턴스 변수
			System.out.println(Outer.this.var); 			//인스턴스 변수
		}
	}
	
	static class StaticInner{								// 스태틱 클래스
	//스태틱 클래스에서는 클래스 멤버만 사용 가능
//		int inner1 = instanceVar;
		int inner2 = classvar;
		static int inner3 = classvar;
	}
	
	void method(){											//지역 변수
		
		int localVar1 = 3;
		final int localVar2 =4;
		
		class LocalInner{									//지역 클래스
			
		//지역 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능하고
		//final이 붙은 지역변수도 사용 가능
			int inner1 = instanceVar;
			int inner2 = classvar;
//			int inner3 = localVa1;							//final이 붙지 않은 지역변수는 사용 불가
			int inner4 = localVar2;
		}
		//지역 클래스는 메서드 내부에서 인스턴스화를 통해 사용 가능
		LocalInner li = new LocalInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
		
		//인스턴스 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		//static 클래스는 클래스를 통해서 바로 접근할 수 있다.
		System.out.println(StaticInner.inner3);
		//static 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		StaticInner si =new StaticInner();
		System.out.println(si.inner2);
	}
}