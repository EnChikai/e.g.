package blogex.ex0913;

import java.util.Random;

public class Ex0913_1 {

	public static void main(String[] args) {
		
		Random random = new Random();	
		
		int num = random.nextInt(9790597);
		
		long before = System.currentTimeMillis();
		
		if(num>0) {
			for(int i=0;!(num==i);i++) {
				System.out.println(i);
				
				if(i==num) {
					break;
				}
			}
		}else if(num<0){
			for(int i=0;!(num==i);i--) {
				System.out.println(i);
				
				if(i==num) {
					break;
				}
			}
		}
		
		
		long after = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + (after-before)/1000 + "초");
	}
}
