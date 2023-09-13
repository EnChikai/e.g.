package blogex.ex0913;

import java.util.Random;

public class Ex0913_1 {

	public static void main(String[] args) {

/*
1. Random(10000000)을 사용하여 0부터 특정 랜덤값만큼 
   1씩 증가하거나 감소하는 것을 출력하는 프로그램을 구축하시오.
   추가적으로 해당 프로그램의 계산이 끝날때 까지의 시간을 보기와
   같이 출력하시오 
 
보기 : 

	.
	.
	.
	.
4478791
4478792
4478793
4478794
4478795
4478796
4478797
4478798
4478799
4478800
4478801
4478802
4478803
4478804
4478805
4478806
걸린 시간 : 14초
  		
 */
		
		Random random = new Random();	
		
		int num = random.nextInt(10000000);
		
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

