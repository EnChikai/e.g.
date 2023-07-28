package blogex.mahjong;

import java.util.Arrays;
import java.util.Random;

public class Orignal {

	public static void main(String[] args) {

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
		num[31] = "|  |";
		num[32] = "|發|";
		num[33] = "|中|";
		
		for(int i = 0; i<14; i++) {
			mahjong[i] = num[ran.nextInt(34)];
			
		}
		
		
		
		System.out.println("오늘의 마작 운세");
		for(int i = 0; i<14; i++) {
			Arrays.sort(mahjong);
			System.out.print(mahjong[i]);

		}
		
	}

}
