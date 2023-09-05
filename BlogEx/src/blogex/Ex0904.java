package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0904 {

	public static void main(String[] args) {

/*
  
1. 음수와 양수를 기입받으면 보기와 같이 출력되도록 프로그래밍 하시오
2. 음수 양수 이외를 기입시 "음수 또는 양수를 기입바랍니다"가 숫자가 기입될때까지
  반복되도록 하시오

보기 1:
숫자를 입력하세요
 >> a
음수 또는 양수를 기입바랍니다
 >> 0
음수 또는 양수를 기입바랍니다
 >> 10
숫자 10 의 카운트 : 0 1 2 3 4 5 6 7 8 9 10 
시스템 종료

보기 2:  
숫자를 입력하세요
 >> -10
숫자 -10 의 카운트 : 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
시스템 종료

*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = 0;
		int count = 0;
		
		for(int i=0; i<1; i++) {	
			try {
				System.out.print(" >> ");
				num = sc.nextInt();
				
				if(count==num){
					System.out.println("음수 또는 양수를 기입바랍니다");
					i--;
					
				}else if(count<num) {
					System.out.print("숫자 "+num+" 의 카운트 : ");
					while(true){
						
						System.out.print(count+" ");
						
						count++;
						
						if(count==num+1) {
							break;
						}
						
					}
				}else if(num<count){
					System.out.print("숫자 "+num+" 의 카운트 : ");
					while(true){
						
						System.out.print(count+" ");
						
						count--;
						
						if(count==num-1) {
							break;
						}
						
					}
				}	
			}catch(InputMismatchException e) {
				System.out.println("음수 또는 양수를 기입바랍니다");
				i--;
				sc.nextLine();
			}
		}	
	
		System.out.println("\n시스템 종료");
		sc.close();
		
	}

}
