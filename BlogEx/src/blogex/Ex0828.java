package blogex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0828 {

	public static void main(String[] args) {

/*
  
1. 변의 길이가 다른 다각형 넓이를 구하는 프로그램을 만드시오  
2. 보기와 같이 출력하시오

보기:

꼭지점의 갯수를 입력해주세요
"0"입력시 종료됩니다.
 >> ㅁ
잘못된 입력입니다. 재입력 바랍니다.
 >> -1
잘못된 입력입니다. 재입력 바랍니다.
 >> 5
1번째 "X" 값을 입력해주세요
-
잘못된 입력입니다. 재입력 바랍니다.
1번째 "X" 값을 입력해주세요
ㅁ
잘못된 입력입니다. 재입력 바랍니다.
1번째 "X" 값을 입력해주세요
-3
1번째 "Y" 값을 입력해주세요
-
잘못된 입력입니다. 재입력 바랍니다.
1번째 "X" 값을 입력해주세요
-3
1번째 "Y" 값을 입력해주세요
-2
2번째 "X" 값을 입력해주세요
-1
2번째 "Y" 값을 입력해주세요
4
3번째 "X" 값을 입력해주세요
6
3번째 "Y" 값을 입력해주세요
1
4번째 "X" 값을 입력해주세요
3
4번째 "Y" 값을 입력해주세요
10
5번째 "X" 값을 입력해주세요
-4
5번째 "Y" 값을 입력해주세요
9
5각형의 넓이는 60cm² 입니다
  
  		
 */
		
		Scanner sc = new Scanner(System.in);

		int xVer = 0;
		int yVer = 0;
		int result = 0;
		int multiply = 0;
		int vertex = 0;
		int[][] coordinate = null;

		System.out.println("꼭지점의 갯수를 입력해주세요");
		System.out.println("\"0\"입력시 종료됩니다.");
		for (int i = 0; i < 1; i++) {
			try {
				System.out.print(" >> ");
				vertex = sc.nextInt();
				if (vertex < 0) {

					System.err.println("잘못된 입력입니다. 재입력 바랍니다.");
					i--;
					sc.nextLine();

				} else if (vertex > 0) {

					coordinate = new int[vertex + 1][2];

					for (int j = 0; j < vertex; j++) {
						try {
							System.out.println((j + 1) + "번째 \"X\" 값을 입력해주세요");
							xVer = sc.nextInt();
							coordinate[j][0] = xVer;

							System.out.println((j + 1) + "번째 \"Y\" 값을 입력해주세요");
							yVer = sc.nextInt();
							coordinate[j][1] = yVer;

							if (j == vertex - 1) {
								coordinate[vertex][0] = coordinate[0][0];
								coordinate[vertex][1] = coordinate[0][1];
							}
						} catch (InputMismatchException e) {
							System.err.println("잘못된 입력입니다. 재입력 바랍니다.");
							j--;
							sc.nextLine();
						}
					}

					for (int j = 0; j < vertex; j++) {
						multiply += coordinate[j][0] * coordinate[j + 1][1];
					}

					result += Math.abs(multiply);

					multiply = 0;
					for (int j = 0; j < vertex; j++) {
						multiply += coordinate[j][1] * coordinate[j + 1][0];
					}

					result += Math.abs(multiply);

					System.out.print(vertex + "각형의 넓이는 ");
					System.out.print(result / 2 + "cm² 입니다");

				} else {

					System.out.println("시스템을 종료합니다");
					break;

				}

			} catch (InputMismatchException e) {
				System.err.println("잘못된 입력입니다. 재입력 바랍니다.");
				i--;
				sc.nextLine();
			}
		}
		
		sc.close();
	}
}

