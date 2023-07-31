package blogex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex0731_ArrayList {

	public static void main(String[] args) {

/*
  
1. ArrayList와 Set을 사용하여 입력한 숫자만큼의 배열크기를 얻어
 기입받은 후 중복제거 및 정렬이 된 종합값과 짝수와 홀수를 보기와같이
 출력되도록 프로그램 하시오

2. 지정값 이외의 문구를 입력했을 경우 발생하는 오류를 try-catch하여 
  정규값을 입력 할때까지 반복하도록하여 정상 작동하도록 진행해보시오

보기 1:

배열 크기를 입력하세요
 >> 5

넣고자 하는 숫자를 입력하세요
 >> 7
[7]
 >> 4
[7, 4]
 >> 2
[7, 4, 2]
 >> 10
[7, 4, 2, 10]
 >> 7
[7, 4, 2, 10, 7]

- - - - - - 최종 결과 - - - - - -
중복제거 및 정렬 값 : [2, 4, 7, 10]
홀수 값 : [7]
짝수 값 : [2, 4, 10]
시스템 종료됩니다.

==============================================  
  
보기 2 :

배열 크기를 입력하세요
 >> 가나다

잘못된 입력입니다. 
다시 입력해주세요.
 >> 2

넣고자 하는 숫자를 입력하세요
 >> 1
[1]
 >> 가나다

잘못된 입력입니다. 
다시 입력해주세요.
 >> 2
[1, 2]

- - - - - - 최종 결과 - - - - - -
중복제거 및 정렬 값 : [1, 2]
홀수 값 : [1]
짝수 값 : [2]
시스템 종료됩니다.
  		
 */
		
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
					
					System.out.println();
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
