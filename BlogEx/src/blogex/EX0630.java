
//2023.06.30

package blogex;

import java.util.Scanner;

public class EX0630 {
	public static void main(String[] args) {
/*
1.	[Scanner, if(else관련 포함), for] 해당부분을 포함하여 짝수를 기입시 1을 9번 빼고,
홀수를 기입시 1을 9번 더하도록 프로그램을 만드시오.
단, 0을 기입시 "무효값입니다."가 출력되도록 해야합니다
*/
		Scanner reader = new Scanner(System.in);
		
		System.out.print("0을 제외한 숫자를 기입하세요 : ");

		int num = reader.nextInt();
		
		if ((num == 0 )) {
			System.out.println("\n무효값입니다.");
		}
		
		else if (num % 2 == 0 ) {
			System.out.print("결과 : ");
			for (int i = 0 ; i<10 ; i++) {
				System.out.print(num++ + ", ");
			}
		}
		
		else {
			System.out.print("결과 : ");
			for (int i = 0 ; i<10 ; i++) {
				System.out.print(num-- + ", ");
			}
		}
		
		reader.close();
		
	}
}
