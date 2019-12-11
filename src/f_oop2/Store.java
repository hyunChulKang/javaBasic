package f_oop2;

public class Store {
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		Product p = new Desktop();							//Up -casting
		p.info();
		c.buy(p);
		p = new TV();
		p.info();
		c.buy(p);
		c.showItem();
	}

}
				/* 부모 클래스*/
class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	
	void info(){
		System.out.println("----------------------");
		System.out.println("상품명 : " + name);
		System.out.println("금액 : " + price + "원");
		System.out.println("----------------------");
	}
}
//-----------------------------------------------------------------
class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 500000);
//-----------------------------------------------------------------		
	}
}
class TV extends Product{
	TV(){
		super("LG TV", 1000000);
	}
}
//-----------------------------------------------------------------
class Customer{
	int money = 2000000000;
	Product [] item = new Product[10]; 	//장바구니				//배열: 같은 타입의 데이터를 묶어서 사용  Product안에 변수를 사용한다.
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
		
	}
	void showItem(){
		System.out.println("-------------장바구니-------------");
		for(int i = 0; i <item.length; i++){
			if(item[i] != null){
				System.out.println(i + 1 +". " + item[i].name);
			}
		}
		System.out.println("----------------------------");
	}
}