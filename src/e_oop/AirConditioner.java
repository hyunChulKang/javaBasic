package e_oop;

public class AirConditioner {

	//전원버튼 ,온도버튼, 풍량조절버튼, 속성
	//전원담당변수 on/off(boolean)
	
	boolean power; 		//전원
	int temperature; 	//온도
	int airVolume; 		//풍량
	
	AirConditioner() {
		power =false;
		temperature =24;
		airVolume = 1;
	}
	
	//전원버튼	반환값없는 메서드
	void power(){
		 power = !power;
		 System.out.println(power);
	}
	
	
	//온도 +버튼
	void temperatureUp(){
		if(power && temperature<19){
			temperature++;
			System.out.println(temperature);
		}
	}
	//온도 -버튼
	void temperatureDown(){
		if(power && temperature>30){
			temperature--;
			System.out.println(temperature);
		}
	}
	//풍량버튼
	void airVoluem(){
		if(power){
			if(3 <++airVolume){
				airVolume =1;
				System.out.println(airVolume);
			}
		}
	}
	
	//온도가 18 ~30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드를 변경해주세요.
		
	
	public static void main(String[] args) {
		AirConditioner ac =new AirConditioner();
		ac.power();
		ac.temperatureUp();
		ac.temperatureDown();
		ac.airVoluem();
		
		
	}
}
