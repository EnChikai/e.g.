package blogex;

import java.util.Arrays;
import java.util.Random;

public class Ex0824 {

	public static void main(String[] args) {

/*
1. int[] group1의 길이만큼 랜덤으로 0~33까지의 숫자를 
   입력하되 3번 루프한다.

2. 마지막 루프때 int[] group2의 길이만큼 랜덤으로 0~33까지의 숫자를 입력한다.
	(단, int[] group1 반복문 안쪽에 int[] group2가 포함되어있어야한다)

3. 보기와 같이 출력한다
  
보기 : 
[31, 28, 25]
[9, 23, 28]
[10, 4, 1]
[21, 14]  
  
*/
		
		Random ran = new Random();

		int[] group1 = new int[3];
		int[] group2 = new int[2];

		for (int k = 0; k < 3; k++) {
			for (int i1 = 0; i1 < group1.length; i1++) {

				int num1 = ran.nextInt(33);

				boolean doppel = false;

				for (int j1 = 0; j1 < i1; j1++) {
					if (group1[j1] == num1) {
						doppel = true;
						break;
					}
				}

				if (doppel) {
					i1--;
					continue;
				}
				group1[i1] = num1;

				if (k == 2) {
					for (int i2 = 0; i2 < group2.length; i2++) {

						int num2 = ran.nextInt(33);

						boolean ganger = false;

						for (int j2 = 0; j2 < i2; j2++) {
							if (group2[j2] == num2) {
								ganger = true;
								break;
							}
						}

						if (ganger) {
							i2--;
							continue;
						}
						group2[i2] = num2;
					}
				}

			}

			System.out.println(Arrays.toString(group1));
		}
		System.out.println(Arrays.toString(group2));
	}
}

