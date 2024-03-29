package e_oop;

public class RecursiveCall {
		
	/*
	 *  <<재귀호출 >>
	 *  - 메서드 내에서 메서드 자신을 호출하는 것이다.
	 *  - 재귀호출을 하는 메서드를 재귀 메서드라고 한다.
	 *  - 무한반복을 벗어나기 위한 조건이 있어야 한다.
	 */
	public static void main(String[] args) {
		//팩토리얼 : 4! == 4 * 3 * 2 * 1 == 24
		int result = factorial(4);
		System.out.println(result);
	}
	
	//콜스텍에 실행되는 순서 와 값
	/*
	 * ㅣfactorial(1)ㅣ 1
	 * ㅣfactorial(2)ㅣ 2 * factorial(1)
	 * ㅣfactorial(3)ㅣ 3 * factorial(2)
	 * ㅣfactorial(4)ㅣ 4 * factorial(3)
	 * ㅣmain()		 ㅣ 
	 */
	
	//콜스텍에서 종료 되는 순서 와 값
	/*
	 * ㅣ			 ㅣ 1						ㅣ
	 * ㅣ			 ㅣ 2 * 1					ㅣ
	 * ㅣfactorial(3)ㅣ 3 * 2 * 1				ㅣ
	 * ㅣfactorial(4)ㅣ 4 * factorial(3)	    \/
	 * ㅣmain()		 ㅣ 
	 */
	
	
	private static int factorial(int i) {
		int result = 0;
		
		if(i ==1){
			result =1;
		}else{
			result = i * factorial(i -1 );
		}
		return result;
	}

}
