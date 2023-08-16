package blogex;

import java.util.Scanner;

public class EX0814 {
	public static void main(String[] args) {

/*
  
  1. 보기와 같이 출력되도록 프로그램을 수정하시오
  
	준비물 갯수를 입력해주세요.
	eg) 1, 2, 3
	 >> 셋
	올바른 숫자를 입력해주세요
	 >> 3
	준비물 품목을 입력해주세요.
	1. >> 지우개
	2. >> 볼펜
	3. >> 샤프
	
	----------------------------------.
	
	1. 지우개의 갯수는? >> 두개
	올바른 숫자를 입력해주세요
	1. 지우개의 갯수는? 
	 >> 2
	2. 볼펜의 갯수는? 
	 >> 2
	3. 샤프의 갯수는? 
	 >> 1
	
	------- 1000원 SHOP 영수증 --------
	번호	물품명	갯수	개당금액
	1.		지우개	2		2000	
	2.		볼펜	2		2000	
	3.		샤프	1		1000	
	----------------------------------.
	
	구매품의 총 갯수는 5개 입니다.
	구매품의 총 금액은 5,000원 입니다.
  
  
*/

		Scanner sc = new Scanner(System.in);

		final int NUMBER = 8;

		String[] materials = new String[NUMBER + 1];
		int[] num = new int[NUMBER + 1];
		int[] money = new int[NUMBER + 1];

		System.out.println("준비물 품목을 입력해주세요.");

		for (int i = 0; i < NUMBER - 1; i++) { // 물품명 입력
			System.out.print((i + 1) + ". >> ");
			materials[i] = sc.nextLine();
		}
		System.out.println();
		System.out.println("----------------------------------.");
		System.out.println();

		for (int i = 0; i < NUMBER - 1; i++) { // 물품 갯수 입력
			System.out.print((i + 1) + ". " + materials[i] + "의 갯수는? \n >> ");
			num[i] = sc.nextInt();

			// 물품 총 갯수 계산
			num[8] += num[i];

			// 개당 금액 계산
			money[i] += num[i] * 1000;

			// 총 금액 계산
			money[8] += money[i];
		}
		System.out.println();
		System.out.println("------- 1000원 SHOP 영수증 --------");
		System.out.println("번호\t물품명\t갯수\t개당금액");

		for (int i = 0; i < NUMBER - 1; i++) {
			System.out.print((i + 1) + ".	");
			System.out.print(materials[i] + "\t");
			System.out.print(num[i] + "\t");
			System.out.printf(money[i] + "\t");
			System.out.println();
		}
		System.out.println("----------------------------------.");
		System.out.println();
		System.out.println("구매품의 총 갯수는 " + num[8] + "개 입니다.");
		System.out.println("구매품의 총 금액은 " + money[8] + "원 입니다.");

		sc.close();

	}
}
