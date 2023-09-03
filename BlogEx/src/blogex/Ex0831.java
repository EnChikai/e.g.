package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0831 {

	public static void main(String[] args) {
		 
/*
  
1. 길이 값과 높이 값을 입력받아 아래 보기와 같이
출력되도록 프로그래밍 하시오
(단 에러 출력문을 사용하지 않고 에러 글자색을 붉게 하시오)  
 
보기 : 
길이를 입력하세요 >> ㅁ
 [ERR]숫자를 입력 바랍니다

길이를 입력하세요 >> 5
높이를 입력하세요 >> ㅎ
 [ERR]숫자를 입력 바랍니다

높이를 입력하세요 >> 5

     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

  
  
 */
		Scanner sc = new Scanner(System.in); 
		int length = 0;
		int hight = 0;
		
		for(int i = 0; i<1; i++) {
			try {
				
				System.out.print("길이를 입력하세요 >> ");
				length = sc.nextInt(); 
				
			} catch (InputMismatchException e) {
				System.out.printf("\033[38;2;255;0;0m [ERR]숫자를 입력 바랍니다\033[m\n"); 
				System.out.println();
				sc.nextLine();
				i--;
				
			}
		}
		
		for(int i = 0; i<1; i++) {
			try {
				
				
		System.out.print("높이를 입력하세요 >> ");
		hight = sc.nextInt(); 
		
			} catch (InputMismatchException e) {
				System.out.printf("\033[38;2;255;0;0m [ERR]숫자를 입력 바랍니다\033[m\n"); 
				System.out.println();
				sc.nextLine();
				i--;
				
			}
		}
		
		System.out.println();
		for(int i = 0 ; i<hight ; i++) {
			
			for(int r = length ; i<r ; r--) {
					System.out.print(" ");		
			}
		
			
			for(int r = 0 ; r<i+1 ; r++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		sc.close();
	}
}

