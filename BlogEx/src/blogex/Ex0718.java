
//2023.07.19

package blogex;

import java.io.IOException;
import java.io.InputStream;

public class Ex0718 {

	public static void main(String[] args) {

/*
		  
다음 코드에서 발생한 에러를 "예외처리" 하여 보기의 결과값이 되도록 출력하시오
		  
- 보기 -
		  
Input : A
65
문자열 값이 null로 대입되어있습니다		<= 빨간색
0.0
3.141592653589793
6.283185307179586
참조하는 인덱스를 잘못 사용하였습니니다		<= 빨간색
배열에 대입한 값이 유형과 다릅니다		<= 빨간색
		  
*/

		// 1번 문제 ------------------------------------------------------------

		InputStream is = System.in;

		System.out.print("Input : ");
		try {

			System.out.println(is.read());

		} catch (IOException e) {
			e.printStackTrace();
		}


		// 2번 문제 ------------------------------------------------------------

		String str = null;

		if (str != null) {

			System.out.println(str.length());

		} else {

			System.err.println("문자열 값이 null로 대입되어있습니다");
		}


		// 3번 문제 ------------------------------------------------------------

		double[] arr = new double[3];
		int i = 0;

		do {

			if (i < 0 || i >= arr.length) {
				System.err.println("참조하는 인덱스를 잘못 사용하였습니니다");
				break;
			}

			arr[i] = i * Math.PI;

			System.out.println(arr[i]);
			
			i++;
			
		}while(true);

		
		// 4번 문제 ------------------------------------------------------------

		Object[] oArr = new String[5];
		int[] iArr = { 1, 2, 3, 4 };

		for (int j = 0; j < oArr.length; j++) {

			try {

				oArr[i] = iArr[i];

			} catch (ArrayStoreException e) {
				System.err.println("배열에 대입한 값이 유형과 다릅니다");
				break;
			}
		}

	}

}

