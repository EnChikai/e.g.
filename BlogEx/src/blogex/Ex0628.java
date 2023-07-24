
//2023.06.28

package blogex;

public class Ex0628 {
	
	public static void main(String[] args) {
	
/*
1.	아래의 프로그램을 Run 하지 말고 출력값을 계산하시오
		
*/
	
		int A = 1, B = 2, C = 3;	
		
		int D = ++B + C-- * A++;
		boolean value1 = ((D + B++) < ++A) && ((C-- + D) > ++A); 
		System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
		
		D = --A - B-- + C;
		boolean value2 = (--A + C - D++) > ++C || ((++D + B--) > A++); 
		System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
	}

}
