package z_exam;

public class Exam03 {

	public static void main(String[] args) {
//1	
//		int x = 2;
//		int y = 5;
//		char c = 'A';
// 'A' 65
//		 System.out.println(1 + x << 33); // 6
//		 System.out.println(y >= 5 || x < 0 && x > 2); // true
//		 System.out.println(y += 10 - x++); //13
//		 System.out.println(x+=2); //5
//		 System.out.println( !('A' <= c && c <='Z') ); //false
//		 System.out.println('C'-c); //2
//		 System.out.println('5'-'0'); //5
//		 System.out.println(c+1); //66
//		 System.out.println(++c); //B
//		 System.out.println(c++); //B
//		 System.out.println(c); //C
//2  
//		 int numOfApples = 123;//사과의 개수
//		 int sizeOfBucket = 10;// 바구니의 크기 바구니에 담을 수 있는 사과의 개수 
//		 int numOfBucket = ( numOfApples/sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 :0) );// 모든 사과를 담는데 필요한 바구니의 수 );
//		 System.out.println("필요한 바구니의 수 : "+numOfBucket);
//3
//		 int num = 3;
//		 System.out.println( 0< num  ? "양수" : (num < 0 ? "음수" : 0));
//4
//		 int num = 456;
//		 System.out.println( (num/100)*100);
//5
//		 int num = 333;
//		 System.out.println( ((num/10)*10)+1  );
//6
//		 int num = 24;
//		 System.out.println( (num/10+1)*10-num );
//		 System.out.println( 10- (num%10) );

		 //7
//		 int fahrenheit = 100;
//		 float celcius = (  (int)((5/9f * (fahrenheit -32))* 100+0.5) / 100f );
//		 System.out.println("Fahrenheit:"+fahrenheit);
//		 System.out.println("Celcius:"+celcius);
//8
//		 byte a = 10;
//		 byte b = 20;
//		 byte c = (byte)(a + b);
//		 
//		 char ch = 'A';
//		 ch = (char)(ch + 2);
//		 
//		 float f = 3 / 2f;
//		 long l = 3000L * 3000 * 3000;
//		 
//		 float f2 = 0.1f;
//		 double d = 0.1; 
//		 
//		 boolean result = (float)d==f2;
//		 
//		 System.out.println("c="+c);
//		 System.out.println("ch="+ch);
//		 System.out.println("f="+f);
//		 System.out.println("l="+l);
//		 System.out.println("result="+result);
//9
//		 char ch = 'z';
//		 boolean b = ( (0<= ch || ch<=9) || ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')    );
//		 System.out.println(b);
//10
		 char ch = 'A';
		 char lowerCase = ( 'A' <= ch && ch <= 'Z'  ) ? (  (char)(ch + 32)  ) : ch;
		 System.out.println("ch:"+ch);
		 System.out.println("ch to lowerCase:"+lowerCase);

		}
		
	}


