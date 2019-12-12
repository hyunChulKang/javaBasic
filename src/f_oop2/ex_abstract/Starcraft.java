package f_oop2.ex_abstract;

public class Starcraft {

	public static void main(String[] args) {
		SCV scv = new SCV();
		
		Tank tank =new Tank();
		Marine marine = new Marine();
		
		scv.repair(tank);
//		scv.repair(marine);										//Repairable을 상속받지 못했기 때문에 컴파일 에러!!
		
	}
}
class Unit{
	
	int hp;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp =MAX_HP;
	}
}

class Marine extends Unit{	
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{				//
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){		 						//Repairable 타입으로 상속 받은 클래스만 사용가능
		//Repairable 인터페이스를 상속 받게 함으로 써 수리가 가능한 유닛을 구분한다.
		//그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		//hp를 멤버로 가진 부모클래스 Unit으로 형변환 해주야한다.
		if(r instanceof Unit){								// a instanceof b (a가 b 타입이 맞는지 확인)형변환
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}