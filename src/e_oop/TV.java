package e_oop;

import java.util.Scanner;

public class TV {
	Scanner sc = new Scanner(System.in);
	boolean power;
	int channel;
	int ch =0;
	int sounds;
	
	TV(){
		power = false;
		channel =1;
		sounds =1;
	}
	
	void power(){
			power = !power;
			System.out.println(power !=true ? "전원꺼짐" : "전원켜짐" );
	}
	
	void channel(){
		if(power){
			System.out.println("현재4번채널 입니다");
			System.out.println("채널을 입력해주세요");
			ch = Integer.parseInt(sc.nextLine());
			if(ch>0 && ch<50){
				System.out.println(ch+"번 채널입니다.");
				soundUp();
			}else{
				System.out.println("해당채널은 없습니다.");
				channel();
			}
		}
	}
	
	void soundUp(){
		if (power){
			if(sounds >0){
				sounds++;
				System.out.println("볼륨 "+ sounds +"단계");
			}
		}
	}
	
	void soundDown(){
		if (power){
			if(sounds >5){
				sounds--;
				System.out.println("볼륨 "+ sounds +"단계");
			}
		}
	}
	public static void main(String[] args) {
		TV tv = new TV();
		tv.power();
		tv.channel();
		tv.soundUp();
		tv.soundDown();
		
	}
	
	
}
