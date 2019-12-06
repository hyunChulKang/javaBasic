package e_oop;

class Account{												//static 비교 예제
	private String name;	//계좌이름
	private int amount;		//금액
	private float iyul;		//이율
	
	public Account(String name, int amount, float iyul){
		this.name 	= name;
		this.amount = amount;
		this.iyul 	= iyul;
	}
	public void disp(){
		System.out.println("이름 : " + this.name + ", 돈 : " + this.amount + 
					 	   ", 이율 :" + this.iyul);
					
	}
}

public class Accounts {									
	public static void main (String[] args){
		///AAA 계좌 신설
		Account p1 =new Account("홍길동", 10000, 0.07f);
		p1.disp();
		System.out.println();
		/// 5년뒤 BBB 계좌 신설	(이율변동)
		Account p2 = new Account("이몽룡", 20000, 0.05f);
		p1 = new Account ("홍길동", 10000, 0.05f);
		p1.disp();
		p2.disp();
		
		System.out.println();
		//3년 뒤 이율 업그레이드
		p1 = new Account("홍길동", 10000, 0.03f);
		p2 = new Account("이몽룡", 10000, 0.03f);
		p1.disp();
		p2.disp();
		

		
	}
}









