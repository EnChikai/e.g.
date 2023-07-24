package blogex.ex0714;

import java.util.Scanner;

public class Ex0714 {

	public static void main(String[] args) {
		
/*

1. 일반클래스(기능클래스)와 실행클래스를 각각 하나씩 만드시오.

2. StringBuilder와 substring을 사용하고 Scanner로 입력받아 
보기와 같이 출력하시오.

보기 : 

앵무새에게 말하기 : 안녕하세요
앵무새 :  안... 안녕하세요, 안녕하세요!!!!

*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("앵무새에게 말하기 : ");
		String parrot = sc.nextLine();
		Parrot.print(parrot);
		
		
	}
}

