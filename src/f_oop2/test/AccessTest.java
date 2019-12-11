package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);		//접근가능
		am.publicMethod();
		
//		System.out.println(am.protectedVar);	
//		am.protectedMethod();
//	
//		System.out.println(am.defaultVer);		//접근불가
//		am.defalutMethod();
//		
//		System.out.println(am.privateVar);		//접근불가
//		am.privateMethod();
		
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
	}

}
