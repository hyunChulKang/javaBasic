package e_oop;

class Accountst{
	private String name;
	private int amount;
	static float iyul;
	
	public Accountst(String name, int amount){
		this.name = name;
		this.amount = amount;
	}
	
	public void disp(){
		System.out.println("이름" + this.name + " 돈 : " + this.amount + ", 이율 : " + iyul);
		
	}
}


public class exstatic {
	public static void main(String[] args){
		Accountst.iyul = 0.07f;
		
		Accountst p1 = new Accountst("AAA", 10000);
		p1.disp();
		System.out.println();
		
		Accountst.iyul = 0.05f;
		Accountst p2 = new Accountst("BBB",20000);
		
		p1.disp();
		p2.disp();
		
		Accountst.iyul =0.03f;
		p1.disp();
		p2.disp();
	}
}
