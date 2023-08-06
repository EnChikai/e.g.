package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0804 {

	public static void main(String[] args) {

/*
 
1. Scanner와 제어문을 사용해 보기와 같이 출력할 수 있도록
   프로그램을 만드시오 
 
보기1 : 
- - - Marry Christmas - - -
Input Tree Length
 >> 가나다
잘못된 입력입니다. 재입력 바랍니다.
 >> 
 
==================================== 

보기2 : 
- - - Marry Christmas - - -
Input Tree Length
 >> 5

   ☆    
   **
  ****
 ******
********
   □ 
  	
 */
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("- - - Marry Christmas - - -");
		System.out.println("Input Tree Length");
			
		int length = 0;
		int oneStar = 0;
		int tree = 0;
		for (int i = 0; i < 1; i++) {
			try {
				
				System.out.print(" >> ");
				length = sc.nextInt();
				System.out.println();
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 재입력 바랍니다.");
				sc.nextLine();
				i--;
			}
		}
		
		for(int i = 0 ; i<length-2 ; i++) {	
			System.out.print(" ");
		}
		
		if(oneStar == 0) {
			System.out.print("☆");
			oneStar++;
		}
		
		
		for(int i = 0 ; i<length ; i++) {	
			for(int j = length-1 ; j>i ; j--) {	
				System.out.print(" ");
			}
			
			for(int j = 0 ; j<(i*2) ; j++) {	
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 0 ; i<length-2 ; i++) {	
			System.out.print(" ");
		}
		
		if(tree == 0) {
			System.out.print("□");
			tree++;
		}
		sc.close();
	}
	
}
