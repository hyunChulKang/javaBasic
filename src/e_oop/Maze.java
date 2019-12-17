package e_oop;

import java.util.Scanner;													//입력값넣기

public class Maze {															//미로게임
/*--------------------------------기본값 선언--------------------------------*/
	
	Scanner input = new Scanner(System.in);									//입출력
	int row;																//세로
	int col;																//가로
	int count;																//시도횟수
	int insert;																//입력값
	int[][] road_map = {													//미로지도
				   {1,1,1,1,1,1,1,1,1,1},
				   {1,0,1,1,0,0,0,1,0,1},
				   {1,0,1,1,0,1,0,0,0,1},
				   {1,0,0,0,0,0,1,0,1,1},
				   {1,1,0,1,1,1,1,0,0,1}, 
				   {1,0,0,0,0,0,1,1,1,1},
				   {1,0,1,1,0,1,0,0,0,1},
				   {1,0,1,0,0,0,0,1,0,1},
				   {1,0,0,0,1,0,1,1,0,0},
				   {1,1,1,1,1,1,1,1,1,1}
				   	};
	final int MAXIMUM =50;													//최대사용횟수
	String[] replay = {" 막다른길입니다.\r","다시입력해주세요","미로 탈출 게임을 시작합니다."};
	
/*----------------------------------초기화 ---------------------------------*/
	
	Maze(){																	//초기화 구성
		road_map[row][col] = 0;												//현재 위치
		row=1;																//세로
		col=1;																//가로
		count=0;															//시도횟수
	}
/*---------------------------------실행 메소드--------------------------------*/ 	
	void failSuccess(){														//성공& 실패문구
		if(row == 8 && col == 9){
			System.out.println("\t★☆★☆★☆★☆★☆탈출성공★☆★☆★☆★☆★☆ \r");
			System.out.println("\t\t시도횟수\t\t"+count+"번시도\r");			//최종시도횟수 보여주기
			System.out.println("\t☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆ \r");
		}else{
			System.out.println("\r\t사용횟수 초과 다음기회에...");
		}
	}
	
	void exit(){															//성공&실패 기준설정및 입력값받기 
		for(int i = 0; i<MAXIMUM; i++){										//횟수 제한
			if(row == 8 && col == 9){
				break;
			}else{
				arrow();													//다시시도
			}
		}
	}

	void startTitle(){														//시작타이틀 문구
		System.out.println(replay[2]);
	}																		//시작타이틀 문구 끝
	
	void arrow(){															//입력받은 값으로 방향선택
		count++;															//사용횟수 누적
		if(row == 8 && col == 9){											//골인구역 도착여부
			
		}else{																
			System.out.println("---현재위치---\r"								//위치 확인 및 방향지시문구
								+" 위에서"+this.row+"번째\r"
								+" 왼쪽에서"+this.col+"번째\r"
								+"------------\r\r"
								+ "\t"+count
								+"차 시도\r"
								+ "★★★어느방향으로 가실 건가요?★★★\r"
								+" 1번 ↑ \t 2번 ↓ \r 3번 ← \t 4번  →" );
			insert=Integer.parseInt(input.nextLine());						//입력
				if(insert == 1){											//1번 위
					arrowUp();												//Up페이지로 이동
				}else if(insert == 2){										//2번 아래 
					arrowDown();											//Down페이지로 이동
				}else if(insert == 3){										//3번 왼쪽
					arrowleft();											//left페이지로 이동
				}else if(insert == 4){										//4번 오른쪽
					arrowRight();											//Right페이로 이동
				}else{
					System.out.println(replay[1]);							//다시입력문구
				}
		}
	} 																		//arrow 메서드 끝
	
	void arrowUp(){															//위로이동
		if(row>=0 && row <road_map.length 
				  && road_map[row][col]!=1 			//row변수에 따른 조건식정리
				  && road_map[row][col] == road_map[row-1][col]){
			row--;															//row감소
			this.row = row;													//
		}else{
			System.out.println(replay[0]);
			
		}
	}																		//arrowUp 메서드 끝
	
	void arrowDown(){														//아래이동
		if(row>=0 && row <road_map.length 
				  && road_map[row][col]!=1 			//row변수에 따른 조건식정리
				  && road_map[row][col] == road_map[row+1][col]){
			row++;
			this.row = row;
		}else{
			System.out.println(replay[0]);
		}
				
	}																		//arrowDown 메서드 끝
	
	void arrowleft(){														//왼쪽이동
		if(col <road_map.length 
				&& road_map[row][col]!=1 					//col변수에 따른 조건식정리
				&& road_map[row][col] == road_map[row][col-1]){
			col--;															//col감소
			this.col =col;
		}else{
			System.out.println(replay[0]);
		}
	}																		//arrowleft 메서드 끝
	
	void arrowRight(){														//오른쪽이동
		if(col <road_map.length 
				&& road_map[row][col]!=1 					//col변수에 따른 조건식정리
				&& road_map[row][col] == road_map[row][col+1]){
			col++;															//col증가
			this.col = col;
		}else{
			System.out.println(replay[0]);									
		}
		
	}																		//arrowRight 메서드 끝
/*---------------------------------매인 메소드--------------------------------*/ 
	public static void main(String[] args) {								//main메서드
		
		Maze start = new Maze();											//객체 생성및 초기화
		start.startTitle();													//객체안에 있는 시작타이트 실행
		start.exit();														//객체안에 있는 성공&실패 기준설정및 입력값받기 
		start.failSuccess();												//객체안에 있는 성공& 실패문구
	}

}