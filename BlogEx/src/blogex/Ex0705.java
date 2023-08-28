
//2023.07.05

package blogex;

import java.util.Scanner;

public class Ex0705 {

	public static void main(String[] args) {

/*
 1.	배열변수에 Scanner를 사용하여 입력받아 아래와 같이 출력하도록 코딩하시오
	(물품명과 갯수를 입력하면 개당 금액이 자동으로 연산되어야 합니다.
	단, 배열공간은 모두 [9]이며 총 갯수와 합계금액은 각 배열 마지막 공간에 합하시오)
	
------- 1000원 SHOP 영수증 --------
번호  물품명     갯수    개당 금액
1.    공책       3       3000
2.    연필       4       4000
3.    볼펜       1       1000
4.    지우개     3       3000
5.	  지점토     2       2000
6.	  물감       1       1000
7.	  붓         1       1000

구매품의 총 갯수는 15개 입니다.
구매품의 총 금액은 15000원 입니다.
*/		
		
		Scanner sc = new Scanner(System.in);
		
		final int NUMBER = 8;
		
		String[] materials = new String[NUMBER+1];
		int[] num = new int[NUMBER+1];
		int[] money = new int[NUMBER+1]; 
	
		System.out.println("준비물 품목을 입력해주세요.");
		
		 
		for(int i=0; i<NUMBER-1 ; i++) {	// 물품명 입력
			System.out.print((i+1) + ". >> ");
			materials[i] = sc.nextLine();
		}
		System.out.println();
		System.out.println("----------------------------------.");
		System.out.println();
		
		
		for(int i=0; i<NUMBER-1 ; i++) {	// 물품 갯수 입력
				System.out.print((i+1)+". " + materials[i] + "의 갯수는? >> ");
				num[i] = sc.nextInt();
				
				//물품 총 갯수 계산
				num[8] += num[i] ;
				
				//개당 금액 계산
				money[i] += num[i]*1000;
						
				//총 금액 계산
				money[8] += money[i];
		}
		System.out.println();
		System.out.println("------- 1000원 SHOP 영수증 --------");
		System.out.println("번호\t물품명\t갯수\t개당금액");
		
		for(int i=0 ; i<NUMBER-1 ; i++){
			System.out.print((i+1) +".	");
			System.out.print(materials[i] +"\t");
			System.out.print(num[i] +"\t");
			System.out.printf(money[i] +"\t");
			System.out.println();
		}
		System.out.println("----------------------------------.");
		System.out.println();
		System.out.println("구매품의 총 갯수는 " + num[8] + "개 입니다.");
		System.out.println("구매품의 총 금액은 " + money[8] + "원 입니다.");
		
		
		//String commaPay = String.format("%,d", WORKING_DAY * 150000);
		
		sc.close();
		
	}

}
