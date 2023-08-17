package blogex;

import java.util.Scanner;

public class Ex0816 {

	public static void main(String[] args) {
/*
1. 빈칸을 채워 보기과 같이 완성하시오

보기:
오늘 저녁 메뉴는?
: 카레

저녁 메뉴, 카레로 결정!
재료가 부족하다
장보러가자
예상 재료비 15,000원
마트까지의 거리50.24M
서둘러서 장보기 완료!
사용금액 12,500원

 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 저녁 메뉴는?");
		System.out.print(": ");
		String dinner = sc.nextLine();
		
		System.out.println();
		System.out.printf("저녁 메뉴, %s로 결정!"+"\n", dinner);		
		System.out.println("재료가 부족하다");
		
		System.out.printf("%.5s","장보러가자~!");
		System.out.println();
		
		System.out.println("예상 재료비 " + String.format("%,d원",15000));
		System.out.printf("마트까지의 거리"+"%.2fM"+"\n",50.235);
		System.out.print("서둘러서 장보기 완료!\n");
		System.out.printf("사용금액 %,d원",12500);
		
		sc.close();
		
	}
}

