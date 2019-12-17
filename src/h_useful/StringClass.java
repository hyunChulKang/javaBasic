package h_useful;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * equals() 	 : 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length() 	 : 문자열의 길이를 반환한다.
		 * substring() 	 : 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt() 	 : 지정된 위치의 문자를 반환한다.
		 * indextOf() 	 : 주어진 문자의 위치를 반환 한다.
		 * lastIndexOf() : 주어진 문자의 마지막 위치를 반환한다.
		 * replace() 	 : 문자열 내의 주어진 문자(문자열)을 새로운 문자(문자열)로
		 * 				      바꾼 문자열을 반환한다.
		 * replaceAll()  : 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운
		 * 				      문자열로 바꾼 문자열을 반환한다.
		 * split() 		 : 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 
		 * 				      문자열 배열로 반환한다.
		 * startsWith()  : 주어진 문자열로 시작하는 여부를 반환한다.
		 * endsWith () 	 : 주어진 문자열로 끝나는 여부를 반환한다.
		 * toUpperCase() : 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase() : 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim() 		 : 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc acb  acb";
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.indexOf("a",1));					//인덱스의 특정위치부터 시작 
	
		System.out.println(str.replace("a", "0"));				//a -> 0으로 바꾸기
		System.out.println(str.replaceAll("[a-z]", "0"));		//정규 표현식 사용
		
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(str.split(" +")));	// +문자 앞(현재공백)을 1개 이상으로 나누겠다.
		
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("b"));
	
		System.out.println(str.endsWith("c")
				);
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2 =" abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());						//회원가입을 할때 사용 --사용자의 부주의를 방지하기위해서 
		
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat fromat2 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
		Date time =new Date();
		
		String time1 =format1.format(time);
		String time2 =fromat2.format(time);
		System.out.println(time1);
		System.out.println(time2);
		
		long time3 =System.currentTimeMillis();
		System.out.println(time3);
		
	}
}
