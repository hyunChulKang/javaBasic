package e_oop;

public class ClassMaker2 {

	//전역변수 하나를 선언하고 명시적으로 초기화해주세요.
	
	String str = "전역변수";
	 int var = 10;
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		for(int i =1; i<10; i++){				//위에랑 위치를 바꾸면 다시 위에서부터 값을 읽어내려온다.
			str +=i;							//ex) 명시적:var=10, 블럭: var30;일때  30이 나오고
			var =30;							//순서를바꾸면 블럭 : var=30, 명시적 : var=10로  결국엔 10이 나온다.
		}
	}
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(String str){
		this.str = str;
	}
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(String str,String pool){
			 str=pool;
		this.str= str;
	}
}
