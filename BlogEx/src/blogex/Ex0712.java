
//2023.07.12

package blogex;

import java.util.Random;
import java.util.Scanner;

public class Ex0712 {
	
	private static final String ROCK = "바위";
	private static final String SCISSORS = "가위";
	private static final String PAPER = "보";

	public static void main(String[] args) {

/*
1.	random클래스와 제어문, Scanner클래스을 사용하여
	보기 출력문을 참고하여 [가위, 바위 보] 게임을 코딩하시오.
	(단, 지정된 값이 아닌 다른 값을 입력시 "잘못된 입력입니다"를
	출력하도록 하시오)
	
	보기:
	
	- - - - - 가위, 바위, 보 - - - - -
	[가위, 바위, 보]를 선택하여 입력
 	>> 바위
	Computer : 바위
	
	비겼습니다

	게임 종료

*/		
		
		Random random;
		random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - - - - 가위, 바위, 보 - - - - -");
		System.out.println("[가위, 바위, 보]를 선택하여 입력");
		System.out.print(" >> ");
		
		String[] R_S_P = new String[2];
		R_S_P[0] = sc.nextLine();
		System.out.println();
		
		if(R_S_P[0].equals(ROCK) || R_S_P[0].equals(SCISSORS) || R_S_P[0].equals(PAPER)){
			switch(random.nextInt(3)){
			case 0:
				System.out.println("Computer : 가위");
				R_S_P[1] = SCISSORS;
				break;
			
			case 1:
				System.out.println("Computer : 바위");
				R_S_P[1] = ROCK;
				break;	
				
			case 2:
				System.out.println("Computer : 보");
				R_S_P[1] = PAPER;
				break;	
			}	
			
			System.out.println();

			if(R_S_P[0].equals(R_S_P[1])  ) {
				System.out.println("비겼습니다");
				
			}else if(R_S_P[1].equals(ROCK)) {
				
				if(R_S_P[0].equals(PAPER)) {
					System.out.println("이겼습니다!");
					
				}else if(R_S_P[0].equals(SCISSORS)) {
					System.out.println();
					System.out.println("졌습니다");
					
				}
			}else if(R_S_P[1].equals(PAPER)) {
				
				if(R_S_P[0].equals(SCISSORS)) {
					System.out.println("이겼습니다!");
					
				}else if(R_S_P[0].equals(ROCK)) {
					System.out.println("졌습니다");
					
				}
			}else if(R_S_P[1].equals(SCISSORS)) {
				
				if(R_S_P[0].equals(ROCK)) {
					System.out.println("이겼습니다!");
					
				}else if(R_S_P[0].equals(PAPER)) {
					System.out.println("졌습니다");
					
				}
			}
			
		}else {
			
			System.err.println("잘못된 입력입니다");
			
		}
		System.out.println();
		System.out.println("게임 종료");
			
	}

}
