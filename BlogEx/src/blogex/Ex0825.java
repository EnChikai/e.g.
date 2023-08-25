package blogex;

import java.util.Arrays;
import java.util.Random;

public class Ex0825 {

	public static void main(String[] args) {

		//	group에 랜덤값 임력-> group 정렬 -> 최대중복 3자리까지만 가능
		// ->
		Random ran = new Random();
		
		int[] group = new int[14]; 
		
		for(int i = 0; i<group.length; i++) {
			
			int num = ran.nextInt(33);
			group[i] = num;
		}
		Arrays.sort(group);	
		System.out.println(Arrays.toString(group));
	}

}
