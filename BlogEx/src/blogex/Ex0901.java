package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0901 {

	public static void main(String[] args) {

/*
1.	양수를 입력받으면 해당 숫자만큼 구구단을 구하는 프로그램을
   보기를 참고하여 만드시오.
   
보기 :  
  
- - - 구구단 - - -
숫자를 입력하세요
 >> ㅁ
[ERR]숫자를 입력해 주세요
 >> 0
[ERR]양수를 입력해 주세요
 >> -1
[ERR]양수를 입력해 주세요
 >> 3
1 X 2 = 2
1 X 3 = 3
1 X 4 = 4
1 X 5 = 5
1 X 6 = 6
1 X 7 = 7
1 X 8 = 8
1 X 9 = 9

2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18

3 X 2 = 6
3 X 3 = 9
3 X 4 = 12
3 X 5 = 15
3 X 6 = 18
3 X 7 = 21
3 X 8 = 24
3 X 9 = 27

 */
		
	Scanner sc = new Scanner(System.in);
	int dan = 0;
	
	System.out.println("- - - 구구단 - - -");
	System.out.println("숫자를 입력하세요");
	
	for(int i = 0; i<1; i++) {
		try {
			
			System.out.print(" >> ");
			dan = sc.nextInt();
			if(dan <= 0) {
				System.out.println("[ERR]양수를 입력해 주세요");
				i--;
			}
			
		} catch(InputMismatchException e) {
			
			System.out.println("[ERR]숫자를 입력해 주세요");
			i--;
			sc.nextLine();
			
		}
	}

	for(int j = 0; j<dan; j++) {
		for(int i = 0; i<8; i++) {
			
			System.out.println((j+1) + " X " + (i+2) + " = " + (j+1) * (i+2)); 
		}
		
		System.out.println();
		
	}
	
	sc.close();
	
	}
}


