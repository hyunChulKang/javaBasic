package z_exam;

import java.util.Scanner;

public class HeartTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String _1_1 = s.nextLine();
		String _1_2 = s.nextLine();
		String _1_3 = s.nextLine();
		String _2_1 = s.nextLine();
		String _2_2 = s.nextLine();
		String _2_3 = s.nextLine();
		String _3_1 = s.nextLine();
		String _3_2 = s.nextLine();
		String _3_3 = s.nextLine();
		System.out.println("나금사빠?");
		if(_1_1 == "Y"){//11
			System.out.println("연애끌리는타입?");
			 _1_2 = s.nextLine();
			if(_1_2 == "Y"){
				System.out.println("감정표현에 솔찍?");
				 _2_2 = s.nextLine();
				if(_2_2 == "Y"){
					System.out.println("이성친구는 존재할수 없다?");
					 _3_2 = s.nextLine();
					if(_3_2=="Y"){
						System.out.println("아무것도 안니 일에 쉽게 섭섭함이 쌓인다?");
						 _3_3 = s.nextLine();
						if(_3_3 == "Y"){
							System.out.println("D타입 입니다.");
							
						}else{
								System.out.println("C타입 입니다.");
					
						}//끝
					}else if(_3_2=="N"){
						System.out.println("B타입 입니다.");
					}
				}else if(_2_2 == "N"){
					System.out.println("활동적인 데이트가 좋다");
					_2_3 = s.nextLine();
					if(_2_3 == "N"){
						System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
						_3_3 = s.nextLine();
						if(_3_3 == "N"){
					
							System.out.println("C타입");
						}else{
							System.out.println("D타입");
						}
					}
			 }
		
			
			
		}else if(_1_2 == "N"){
			System.out.println("데이트코스는 미리 짜는게 편한다?");
			 _1_3 = s.nextLine();
			 	if(_1_2=="N"){
					System.out.println("감정표현에 솔찍한 편이다.");
					 _2_2 = s.nextLine();
					 	if(_2_2=="N"){
							System.out.println("아무것도 안니 일에 쉽게 섭섭함이 쌓인다?");
							 _2_3 = s.nextLine();
							 	if(_2_3=="N"){
									System.out.println("아무것도 안니 일에 쉽게 섭섭함이 쌓인다?");
									 _3_3 = s.nextLine();
									 if(_3_3 == "N"){
											System.out.println("C타입");
										}else{
											System.out.println("D타입");
										}//끝
							 	}
					 	}
			 	}
			}	
			
			
		}else if(_1_3 == "N"){
			 	System.out.println("데이트코스는 미리 짜는게 편한다?");
			 	_2_2 = s.nextLine();
			 	if(_2_2 == "N"){
					System.out.println("활동적인 데이트가 좋다");
					_2_3 = s.nextLine();
					if(_2_3 == "N"){
						System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
						_3_3 = s.nextLine();
						if(_3_3 == "N"){
					
							System.out.println("C타입");
						}else{
							System.out.println("D타입");
						}//끝
					}
			 }
		}	
		
			
	
	}else if(_1_1 == "N"){//11
		System.out.println("감정기복이 크지 않다");
		_2_1 = s.nextLine();
			if(_2_1 == "N"){
				System.out.println("감정표현에 솔직한 편이다");
				_2_2 = s.nextLine();
				if(_2_2 == "N"){
					System.out.println("활동적인 데이트가 좋다");
					_2_3 = s.nextLine();
					if(_2_3 == "N"){
						System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
						_3_3 = s.nextLine();
						if(_3_3 == "N"){
					
						System.out.println("C타입");
					}else{
						System.out.println("D타입");
					}
					
				}
			}
		}
	}
	
}
}// 클래스끝
