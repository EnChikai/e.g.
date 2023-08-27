package blogex;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex0825 {

	public static void main(String[] args) {
		
/*

1. 양수를 입력받으면 int[] group 배열에 입력받은
   양수의 길이만큼 랜덤값으로 숫자를 추가하는 프로그램을
   구축하고 보기와 같이 출력하시오
   (단, 아래 보기의 출력결과를 토대로하시오)
   
보기:

양수를 입력하시오
("0"입력시 빈 배열)
 >> -1
[ERROR]양수를 바랍니다.
 >> a
[ERROR]숫자를 입력 바랍니다.
 >> 10
[14, 15, 15, 19, 20, 20, 23, 26, 27, 31]

*/
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int[] group = null;
		System.out.println("양수를 입력하시오");
		System.out.println("(\"0\"입력시 빈 배열)");
	
		for(int i = 0; i<1; i++) {
			try {
				System.out.print(" >> ");
				input = sc.nextInt();
				group =  new int[input]; 
				
			}catch (InputMismatchException e) {
				System.err.println("[ERROR]숫자를 입력 바랍니다.");
				sc.nextLine();
				i--;
				
			}catch (NegativeArraySizeException e) {
				System.err.println("[ERROR]양수를 바랍니다.");
				sc.nextLine();
				i--;
			}
		}
		
		Random ran = new Random();
		
		for(int i = 0; i<group.length; i++) {
			
			int num = ran.nextInt(33);
			group[i] = num;
		}
		
		Arrays.sort(group);	
		System.out.println(Arrays.toString(group));
		
		sc.close();
	}
}

