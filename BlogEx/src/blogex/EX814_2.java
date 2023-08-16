package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX814_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("준비물 갯수를 입력해주세요.");
		System.out.println("eg) 1, 2, 3");
		
		int mNum = 0;
		
		for(int i=0; i<1; i++) {
			try {
				System.out.print(" >> ");
				mNum = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("올바른 숫자를 입력해주세요");
				sc.nextLine();
				i--;
			}
		}
		
		final int NUMBER = mNum;
		
		String[] materials = new String[NUMBER+1];
		int[] num = new int[NUMBER+1];
		int[] money = new int[NUMBER+1]; 
	
		System.out.println("준비물 품목을 입력해주세요.");
		
		sc.nextLine();
		
		for(int i=0; i<NUMBER ; i++) {	// 물품명 입력
			System.out.print((i+1) + ". >> ");
			materials[i] = sc.nextLine();
		}
		System.out.println();
		System.out.println("----------------------------------.");
		System.out.println();
		
		
			
		for (int i = 0; i < NUMBER; i++) { // 물품 갯수 입력
			for (int j = 0; j < 1; j++) {
				try {
					System.out.print((i + 1) + ". " + materials[i] + "의 갯수는? \n >> ");
					num[i] = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("올바른 숫자를 입력해주세요");
					sc.nextLine();
					j--;
				}

				// 물품 총 갯수 계산
				num[mNum] += num[i];

				// 개당 금액 계산
				money[i] += num[i] * 1000;

				// 총 금액 계산
				money[mNum] += money[i];
			}

		}
		System.out.println();
		System.out.println("------- 1000원 SHOP 영수증 --------");
		System.out.println("번호\t물품명\t갯수\t개당금액");
		
		for(int i=0 ; i<NUMBER ; i++){
			System.out.print((i+1) +".	");
			System.out.print(materials[i] +"\t");
			System.out.print(num[i] +"\t");
			System.out.printf(money[i] +"\t");
			System.out.println();
		}
		System.out.println("----------------------------------.");
		System.out.println();
		System.out.println("구매품의 총 갯수는 " + num[mNum] + "개 입니다.");
		System.out.printf("구매품의 총 금액은 " + String.format("%,d",money[mNum]) + "원 입니다.");
		
		sc.close();
		
	}
}
