package blogex;

import java.util.Arrays;
import java.util.Random;

public class Ex0727_Array {

	public static void main(String[] args) {

/*		
	
1. 보기와 같이 랜덤으로 마작패 14개가 출력되는 프로그램을 만드시오		

힌트 : 
1. Random
2. String[]
3. Arrays.sort


보기:
(1)(9)[1][9]{1}{9}|東||東||南||西||北||白||發||中|


*/		
		Random ran = new Random();
		
		String[] num = new String[34];
		String[] mahjong = new String[14];
		
		for(int i = 0; i<num.length-25; i++) {
			num[i] = "("+(i+1)+")";
		}
		for(int i = 9; i<num.length-16; i++) {
			num[i] = "{"+(i-8)+"}";
		}
		for(int i = 18; i<num.length-7; i++) {
			num[i] = "["+(i-17)+"]";
		}
		
		num[27] = "|東|";
		num[28] = "|南|";
		num[29] = "|西|";
		num[30] = "|北|";
		num[31] = "|白|";
		num[32] = "|發|";
		num[33] = "|中|";
		
		for(int i = 0; i<14; i++) {
			mahjong[i] = num[ran.nextInt(34)];
			
		}
		
		for(int i = 0; i<14; i++) {
			Arrays.sort(mahjong);
			System.out.print(mahjong[i]);

		}
		
	}

}
