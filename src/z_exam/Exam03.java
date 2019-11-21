package z_exam;

public class Exam03 {

	public static void main(String[] args) {
	//1	
		int x = 2;
		int y = 5;
		char c = 'A';
		// 'A' 65
		 System.out.println(1 + x << 33);
		 System.out.println(y >= 5 || x < 0 && x > 2);
		 System.out.println(y += 10 - x++); System.out.println(x+=2);
		 System.out.println( !('A' <= c && c <='Z') );
		 System.out.println('C'-c);
		 System.out.println('5'-'0');
		 System.out.println(c+1);
		 System.out.println(++c);
		 System.out.println(c++);
		 System.out.println(c);
	//2  
		 int numOfApples = 123;//사과의 개수
		 int sizeOfBucket = 10;// 바구니의 크기 바구니에 담을 수 있는 사과의 개수 
		 int numOfBucket = ( /* (1) */);// 모든 사과를 담는데 필요한 바구니의 수 );
		 System.out.println("필요한 바구니의 수 : "+numOfBucket);
		 
	//3
		 int num = 10;
		 System.out.println( /* (1) */ );
	//4
		 int num = 456;
		 System.out.println( /* (1) */ );
	//5
		 int num = 333;
		 System.out.println( /* (1) */ );
	//6
		 int num = 24;
		 System.out.println( /* (1) */ );
	//7
		 int fahrenheit = 100;
		 float celcius = ( /* (1) */ );
		 System.out.println("Fahrenheit:"+fahrenheit);
		 System.out.println("Celcius:"+celcius);
	//8
		 byte a = 10;
		 byte b = 20;
		 byte c = a + b;
		 char ch = 'A';
		 ch = ch + 2;
		 float f = 3 / 2;
		 long l = 3000 * 3000 * 3000;
		 float f2 = 0.1f;
		 double d = 0.1; 
		 boolean result = d==f2;
		 
		 System.out.println("c="+c);
		 System.out.println("ch="+ch);
		 System.out.println("f="+f);
		 System.out.println("l="+l);
		 System.out.println("result="+result);
	//9
		 char ch = 'z';
		 boolean b = ( /* (1) */ );
		 System.out.println(b);
	//10
		 char ch = 'A';
		 char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
		 System.out.println("ch:"+ch);
		 System.out.println("ch to lowerCase:"+lowerCase);

		}
		
	}


