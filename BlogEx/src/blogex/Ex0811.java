package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0811 {

	public static void main(String[] args) {

/*
1.	숫자를 입력받아 해당 숫자의 구구단을 계산하는 프로그램을 작성하시오
2.  0을 입력시 반복을 구구단을 행하지 않고 "시스템을 종료합니다"문구가 
 	출력되도록 하시오
3.	숫자 이외가 입력되면 "재입력 바랍니다" 문구를 출력하고 올바른 숫자가
	입력될 때까지 반복되도록 하시오
	
보기1 :
숫자를 입력하세요
: ㅁ
재입력 바랍니다
: 9
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
시스템을 종료합니다

보기2 :
숫자를 입력하세요
: 0
시스템을 종료합니다
	
*/
				
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		
		int input = 0;
		int dan = 0;
		
		for(int i=0; i<1; i++) {
			try {
				System.out.print(": ");
				input = sc.nextInt();
			} catch(InputMismatchException e) {
				System.err.println("재입력 바랍니다");
				sc.nextLine();
				i--;
			}
		}
			
			do {
				if(input == 0) {
					break;
				}
				int num1 = dan+1;
				int num2 = num1*input ;
				System.out.println(input + " x " + num1 + " = " + num2 );
						
				dan++;
						
				if(dan>=9) {
					break;
				}
						
			}while(input != 0);
					
			System.out.println("시스템을 종료합니다");
					
		sc.close();		
		
	}

}

