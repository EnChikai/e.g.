
//2023.07.11

package blogex.ex0711;

public class Ex0711 {

	public static void main(String[] args) {

/*
1.	아래의 프로그램을 Run 하지 말고 출력값을 계산하시오
*/
		
		int A = 3, B = 8, C = 5;	
		
		Doppel Dp = new Ganger(A,B);
		int sum = Dp.sum(); 
		
		if(B>=A) {
			for(int i=0 ; i<C ; i++) {
				A++;
				B--;
			}
		}else if(B<=A)
			for(int i=0 ; i<C ; i++) {
				A++;
				B++;
		}
		sum = sum+C;
		
		boolean value = (--B + A +C--) > sum + C || ((++sum + A--) > A++); 
		System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", sum: " + sum);
		
	}

}

