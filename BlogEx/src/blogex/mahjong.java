package blogex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class mahjong {

	public static void main(String[] args) {

		Random ran = new Random();
		
		String[] num = new String[34];
		String[] mahjong = new String[14];
		String dummy;
		
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
		
//		for(int j = 0 ; j < mahjong.length-1 ; j++) {
//			for(int i = 0 ; i<mahjong.length-1-j ; i++){	//i, 0~3-j ->모든 요소
//			
//					//인접한 두 요소를 비교하고 왼쪽이 크면 스왑
//				if(mahjong[i].sort()(0) > mahjong[i+1].charAt(0)) {//i, 0~4-j 오름차순
//				
//				//스왑
//				dummy = mahjong[i];
//				mahjong[i] = mahjong[i+1];
//				mahjong[i+1] = dummy;
//				
//				}
//			}
//				
//		}
		
		
		
		for(int i = 0; i<14; i++) {
			Arrays.sort(mahjong);
			System.out.print(mahjong[i]);

//			System.out.print(mahjong[i].substring( mahjong[i].length()-3 )+" ");
		}
		
	}

}
