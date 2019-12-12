package f_oop2;

public class Store2 {
	public static void main(String[] args) {
		Customer1 c = new Customer1();
		
		Product1 p = new Desktop1();
		p.info1();
		c.buy1(p);
		
		p = new TV1();
		p.info1();
		c.buy1(p);
		
		c.showItem1();
		System.out.println("남은잔액"+ c.money);
	}
	
}

class Product1 {
	String name;
	int price;
	
	Product1(String name, int price){
			this.name = name;
			this.price = price;
			
	}
	
	void info1(){
		 System.out.println("------------------");
		 System.out.println("상품명" + name);
		 System.out.println("금액"+ price);
		 System.out.println("------------------");
	}
}

class Desktop1 extends Product1 {
	Desktop1(){
		super("삼성", 100000000);
	}
}

class TV1 extends Product1 {
	
	TV1(){
		super("LG", 3000000);
	}
}

class Customer1{
	int money =200000000;
	Product1 []item =  new Product1[10];
		
	void buy1(Product1 p){
		if(money <p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i =0; i<item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}

	void showItem1(){
		System.out.println("---------------------------------");
		for(int i =0; i <item.length; i++){
			if(item[i] != null){
				System.out.println(i+ 1 +". "  + item[i].name);
			}
		}
		System.out.println("-----------------------------------");
	}
}