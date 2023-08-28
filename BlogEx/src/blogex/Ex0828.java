package blogex;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex0828 {

	public static void main(String[] args) {
		
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
			
			int[] dummy = null;
			
			// 중복 3회 허용
			for(int j = 0; j<0; j++) {
				
			}
			
			group[i] = num;
			
		}
		
		Arrays.sort(group);	
		System.out.println(Arrays.toString(group));
		
		sc.close();
		
	}
}
