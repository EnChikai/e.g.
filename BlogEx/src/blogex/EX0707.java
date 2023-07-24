package blogex;

import java.util.Scanner;

public class EX0707 {

	public static void main(String[] args) {

/*
1. 일반클래스(기능클래스)와 실행클래스를 각각 하나씩 만드시오.

2. 기능클래스 맴버필드에 int형 "hight"변수를 private로 만들고,
Constructor를 만들어서 아래의 보기를 출력하는 프로그램을 만드시오.

3. 제작한 프로그램을 실행클래스에서 Constructor를 이용하 "8"을 대입하여
아래와 같이 출력하시오.

**** ****
***   ***
**     **
*       *
*       *
**     **
***   ***
**** ****

*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		System.out.print(" > ");
		StarCreat star;
		star = new StarCreat(sc.nextInt());
	
				
	}

}