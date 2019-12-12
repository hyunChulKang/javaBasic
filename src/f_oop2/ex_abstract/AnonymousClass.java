package f_oop2.ex_abstract;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {

		//하나의 부모클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에		<--일회성 (선언한 곳에서만 사용)
		//객체를 생성한는 클래스
		
		Button b =new Button();
		b.addActionListener(new ActionListener() {
		//ActionListener를 상속받은 자식 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("실행실행실행실행실행실행실행실행");
			}
		});
	}

}
