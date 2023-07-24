
//2023.07.03

package blogex;

import java.util.Scanner;

public class EX0703 {

	public static void main(String[] args) {

/*
1.	숫자를 입력받아 해당 숫자의 구구단을 계산하는 프로그램을 작성하되
 	0을 입력시 반복을 구구단을 행하지 않고 "시스템을 종료합니다"문구가 
 	출력되도록 작성하시오
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int input = sc.nextInt();
		int dan = 0;
		
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



//Scanner sc = new Scanner(System.in);
//System.out.println("숫자를 입력하세요");
//
//int input = sc.nextInt();
//
//	for(int dan = 0; dan<9 ; dan++) {
//		int num1 = dan+1;
//		int num2 = num1*input ;
//		System.out.println(input + " x " + num1 + " = " + num2 );
//		
//	}
//
//sc.close();


//Scanner sc = new Scanner(System.in);
//System.out.println("숫자를 입력하세요");
//
//int input = sc.nextInt();
//int dan = 0;
//
//	while(dan<9) {
//		int num1 = dan+1;
//		int num2 = num1*input ;
//		System.out.println(input + " x " + num1 + " = " + num2 );
//		
//		dan++;
//	}
