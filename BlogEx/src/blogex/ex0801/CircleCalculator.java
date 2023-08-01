package blogex.ex0801;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleCalculator {

	public void Calulator() {
	
		Scanner sc = new Scanner(System.in);
		
		String select;
		Circle ca = new Circle();
		
		System.out.println("- - - - 원의 넓이 계산기 - - - -");
		System.out.println("기입하고자 하는 값을 선택하세요.");
		System.out.println("[1. 지름], [2. 반지름], [0. 종료]");
			
		for(int i=0; i<1; i++) {
				
			System.out.print(" >> ");
			select = sc.nextLine();
				
			if(select.equals("1") || select.equals("지름") || select.equals("1. 지름")) {
						
					sc.reset();
					System.out.println();
					System.out.println("지름값을 입력해 주세요.");
					
					
				for(int j=0; j<1; j++ ) {
					try {
						System.out.print(" >> ");
						ca.diameter(sc.nextDouble());
						
						System.out.println();
						System.out.print("넓이는 : ");
						System.out.printf("%.2f",ca.getResult());
						System.out.println(" 입니다.");
						
					}catch(InputMismatchException e) {
						System.err.println("\n잘못된 입력입니다. 재입력 해주세요.");
						sc.nextLine();
						j--;
					}
				}
			}else if(select.equals("2") || select.equals("반지름") || select.equals("2. 반지름")) {
					
				sc.reset();
				System.out.println();
				System.out.println("반지름값을 입력해 주세요.");
					
				for(int j=0; j<1; j++ ) {
					try {
						System.out.print(" >> ");
						ca.radius(sc.nextDouble());
						
						System.out.println();
						System.out.print("넓이는 : ");
						System.out.printf("%.2f",ca.getResult());
						System.out.println(" 입니다.");
							
					}catch(InputMismatchException e) {
						System.err.println("\n잘못된 입력입니다. 재입력 해주세요.");
						sc.nextLine();
						j--;
					}
				}
			}else if(select.equals("0") || select.equals("종료") || select.equals("0. 종료")) {
				break;
				
			}else {
				System.err.println("\n잘못된 입력입니다. 재입력 해주세요.");
				i--;
			}
		}
		System.out.println("종료합니다.");
		sc.close();
	}
}

