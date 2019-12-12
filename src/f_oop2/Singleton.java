package f_oop2;


// 싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴 -->객체를 여러개 사용할 필요가 없는경우 (같은기능을할때), 객체에 들어있는 모든 변수를 공유할수있어서 사용한다. 
// 객체들간에 객체를 공유하기 위해 사용한다.
public final class Singleton { // 클래스에 final 사용시 다른곳에서 상속 받지 못함.

	private static Singleton instance;
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체 생성하는 것을 막는다.
	private  Singleton() {

	}
	
	public static Singleton getISingleton(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
