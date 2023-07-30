package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0728 {

	public static void main(String[] args) {
		
/*

1. 보기를 참고하여숫자를 입력받을시 양수를 입력받으면 양수, 음수를 입력받음면 음수
  0을 입력받을시 종료하는 반복 프로그램을 구축하시오.
  단, 숫자 이외의 입력을 받을시에는 강제종료 구문을 출력하시오
  (try-catch 사용)
  
보기 1)
- - - 음양 판독기 - - -
숫자를 입력하면 음,양을 판변합니다([0]입력시 종료)
 >> 55
[55] 은 양입니다.
 >> 

보기2)
- - - 음양 판독기 - - -
숫자를 입력하면 음,양을 판변합니다([0]입력시 종료)
 >> 0
종료합니다.

보기3)
- - - 음양 판독기 - - -
숫자를 입력하면 음,양을 판변합니다([0]입력시 종료)
 >> 가나다
잘못된 입력입니다.
강제 종료합니다.

 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - - 음양 판독기 - - -");
		System.out.println("숫자를 입력하면 음,양을 판변합니다([0]입력시 종료)");

		try {
			for(int i = 0; i<2; i++) {
				System.out.print(" >> ");
				int num = sc.nextInt();
				
				if(num == 0) {
					System.out.println("종료합니다.");
					i++;
					break;
					
				}else if(num > 0) {
					System.out.println("[" + num + "] 은 양입니다.");
					i--;
					continue;
					
				}else if(num < 0) {
					System.out.println("[" + num + "] 은 음입니다.");
					i--;
					continue;
				}
			}
			
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				System.out.println("강제 종료합니다.");
			}
		sc.close();
	}

}
