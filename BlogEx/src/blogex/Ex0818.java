package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0818 {

	public static void main(String[] args) {
		
/*
 1. 양수를 입력하면 1부터 해당 숫자까지 출력되고,
   음수를 입력하면 -1부터 해당 숫자까지 출력되도록 하시오
   (단, 결과는 보기와 같아야 합니다.)  

보기:
숫자를 입력하세요
 >> ㅁ
올바른 숫자를 입력해주세요
 >> 0
"0"이외의 숫자를 입력해주세요
 >> 5
1
2
3
4
5
		
*/
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		for(int j = 0; j<1; j++) {
			for (int i = 0; i < 1; i++) {
				try {
					System.out.print(" >> ");
					num = sc.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("올바른 숫자를 입력해주세요");
					sc.nextLine();
					i--;
				}
			}
			
			if(num <= -1){
				for(int i = 0; i>num; i--) {
					System.out.println(i-1);
				}
			}else if(num >= 1) {
				for(int i = 0; i<num; i++) {
				System.out.println(i+1);
				}
			}else {
				System.err.println("\"0\"이외의 숫자를 입력해주세요");
				j--;
			}
		}
		sc.close();
	}
}

