package f_oop2;

public class SampleChild extends SampleParent {
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		int result = method(7,13);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
		sc.test(10);
		SampleParent sp = new SampleChild();	//자식클래스에서 부모 클래스의 생성자를 만들어서 객채를 만든다.
		//부모타입이 가진고 있는 멤버만 사용할 수있다.
		System.out.println("sp.var : " +sp.var);				// sp는 변수를 따라간다. 부모클래스
		System.out.println("sp.var : " +sc.var);				//	자식클래스
		System.out.println("sp.method : " +sp.method(5,10));	//타입에 상관없이 오버라이딩된 메서드만 실행된다.(부모클래스 무시)
		System.out.println("sp.method : " +sc.method(5,10));
//		sp.childMethod();  자식클래스의 메서드 사용x
//		sp.test();		자식클래스 메서드 사용x
	}

	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것.
	@Override// 어노테이션 ---해당 매서드 이름 또는 타입이 다를경우 컴파일 오류를 잡아주기때문에 사용한다.
	int method(int a, int b){//리턴타입 메서드명 파라미터 모두 같아야 한다.
		
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var);						// 지역변수
		System.out.println(this.var);					// 전역변수(인스턴스 변수)
		System.out.println(super.var);					// 부모클래스의 인스턴스 변수
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때
		//둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));		//자식클래스의 메서드
		System.out.println(super.method(10, 20));		//부모클래스의 메서드
	}
	
	SampleChild(){
		super();
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}

}
