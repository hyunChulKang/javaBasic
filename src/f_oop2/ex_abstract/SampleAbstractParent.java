package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	/*
	 * << 추상 메서드 >>
	 * -구현부가 없이 선어부만 존재하는 메서드이다.
	 * -abstract 리턴타입 메서드명();
	 * -클래스 구현에 도움을 주기 위해사용한다.
	 * 
	 * << 추상 클래스 >>
	 * - 추상메서드를 가진 클래스를 추상클래스라고 한다.					//<-- 추상 메서드를  상속받아 오버라이딩(재정의)해서 사용하는것
	 * -- abstract class 클래스명{}
	 * -- 추상클래스는 객체를 생성 할 수 없고, 부모 클래스의 역할만 할 수있다.
	 */
	
	void method(){
		
	}
	
	abstract void abstractMethod(); 						//<--부모 클래싀의 역할
}

class SapmleAbstractChild extends SampleAbstractParent{		//<-- 자식메스드가 부모 메스더 상속 받아  오버라이딩 한다.
	
	//추상메서드를 상속받으면 반드시 구현해야 한다.
	//상속받은 추상 메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야한다.
	
	@Override
	void abstractMethod(){									//<-- 추상 메서드
	
		
	}
}
