package com.inja.test;

public class InterfaceEx2 {

	public static void main(String[] args) {
		Employee p = new Programmer("안철수", "123456", 3);
		Employee d = new Designer("김프로", "23256", "플래쉬");
		Employee pc = new ProgrammerChief("홍길동", "12341", 1, "윈도우개발");
		p.gotoHome();
		p.startJob();
		d.startJob();
		pc.startJob();
		
	}
}
		interface SmallDriver {

			void diverSmallCar();
		}

		abstract class Employee{
			
			String name, id;
			public Employee(String name, String id){
				this.name= name;
				this.id = name;
			}
			public void gotoOffice(){
				System.out.println(name +"님 출근하였습니다.");
			}
			public void gotoHome(){
				System.out.println(name + "님 퇴근하였습니다.");
			}
			abstract public void startJob();
		}

		class Programmer extends Employee implements SmallDriver{
			//기술자 등급 1, 2, 3, 4
			private int techGrade;
			private String carName = "아반테";
			public Programmer(String newName,String newID, int newTechGrade){
				super(newName, newID);
				this.techGrade = newTechGrade;
			}
			

			@Override
			public void diverSmallCar() {
				System.out.println("프로그램개발팀" + super.name + "님이"+ carName + "를 운전합니다.");
			}

			@Override
			public void startJob() {
				System.out.println(super.name + "님이 S/W개발업무를 시작합니다.");
			}
			
			public void disGrade(){
				System.out.println(super.name + "님의 기술자 등급은 " + techGrade + "입니다.");
			}
		}

		class Designer extends Employee{

			private String majorTech;							//주 사용 기술
			
			public Designer(String newName, String newID, String majorTech) {
				super(newName, newID);
				this.majorTech = majorTech;
			}

			@Override
			public void startJob() {
				System.out.println(super.name + "님이 디자인 업무를 시작 합니다.");
			}
			public void disMajorTech(){
				System.out.println(super.name + "님이 주 사용 기술은 " + majorTech + "입니다.");
			}
		}

		class ProgrammerChief extends Programmer {

			private String part;								//업무파트
			
			public ProgrammerChief(String newName, String newID, int newTechGrade, String newPart){
				super(newName, newID, newTechGrade);
				this.part =newPart;
			}
			final public void starJob(){
				System.out.println(super.name + "님이 프로그램 개발팀 직원을 관리합니다.");
			}
			
			public void disPart(){
				System.out.println(super.name + "님이 맡고 있는 파트는 " + this.part+ "입니다.");
			}
		}

