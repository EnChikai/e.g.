
//2023.06.26

package blogex;

public class Ex0626 {
	
	public static void main(String[] args) {
		
/*
1. int형 변수에 오늘 년, 월, 일을 대입하고 이를 형식에 맞게 출력하시오.
   1) 오늘은 ____년 __월 __일 입니다.
*/
		int year = 2023;
		int month = 06;
		int day = 26;
		
		System.out.println("오늘은" + year + "년 " + month + "월 " + day + "일 입니다" );

/*
2. int형 변수를 사용하여 aNum에는 오늘날짜 "월"을, bNum에는 오늘날짜 "일"을 대입해 예시를 출력하시오.
   1) aNum 더하기 bNum는 ___입니다.
   2) bNum 빼기 aNum는 ___입니다.
   3) aNum 곱하기 bNum는 ___입니다.
   4) bNum 나누기 aNum는 ___이고 나머지는 ___입니다.
*/
		int aNum = 06;
		int bNum = 26;
	
		System.out.println("aNum 더하기 bNum는 " + aNum + bNum + "입니다.");
		System.out.println("bNum 빼기 aNum는 " + (bNum - aNum) + "입니다.");
		System.out.println("aNum 곱하기 bNum는 " + aNum * bNum + "입니다.");
		System.out.println("bNum 나누기 aNum는 " + bNum / aNum + "이고 나머지는 " + bNum % aNum + "입니다.");
	
	}
}



