package blogex;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex0810 {

	public static void main(String[] args) {
		
/*
 
1. 문제에 적용되어있는 Import를 참고하여 보기의 출력이 작동되도록
프로그래밍하시오

보기:

- - - 랜덤 숫자 생성 - - -
배열 갯수를 임력하세요
 >> a
잘못된 입력입니다. 재입력 바랍니다.
 >> 10
1 4 5 6 6 6 6 8 8 9 
  
 */
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		System.out.println("- - - 랜덤 숫자 생성 - - -");
		System.out.println("배열 갯수를 임력하세요");
		for(int i = 0; i<1; i++) {
			try {
				System.out.print(" >> ");
				num = sc.nextInt();
			}catch (InputMismatchException e) {
				System.err.println("잘못된 입력입니다. 재입력 바랍니다.");
				sc.nextLine();
				i--;
			}
		}
		
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {

				arr[i] = ran.nextInt(num);
		}

		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
		
	}
	
}	

