package blogex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex0731_ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		Set<Integer> oddNum = new TreeSet<Integer>();
		Set<Integer> evenNum = new TreeSet<Integer>();
		int num;
		
		System.out.println("배열 크기를 입력하세요");
		
	
			for(int i = 0; i<1; i++) {
				try {
					System.out.print(" >> ");
					int size = sc.nextInt();
					System.out.println();
					System.out.println("넣고자 하는 숫자를 입력하세요");
			
					for(int j = 0; j<size; j++) {
						try {	
							
						System.out.print(" >> ");
						num = sc.nextInt();
						set.add(num);
						arr.add(num);
						System.out.println(arr);
						
							if((num%2)!=0) {
								oddNum.add(num);
							}else if((num%2)==0) {
								evenNum.add(num);
							}
							
						}catch(InputMismatchException e) {
							System.err.println("\n잘못된 입력입니다. \n다시 입력해주세요.");
							sc.nextLine();
							j--;
							
						}
					}
					
					System.out.println("- - - - - - 최종 결과 - - - - - -");
					System.out.println("중복제거 및 정렬 값 : " + set);
					System.out.println("홀수 값 : " + oddNum);
					System.out.println("짝수 값 : " + evenNum);
					
					System.out.println("시스템 종료됩니다.");
					
				}catch(InputMismatchException e) {
					System.err.println("\n잘못된 입력입니다. \n다시 입력해주세요.");
					sc.nextLine();
					i--;
			}
		}
		sc.close();
	}

}
