package blogex;

public class Ex0726_Operator {

	public static void main(String[] args) {

/*
1.	아래의 프로그램을 Run 하지 말고 출력값을 계산하시오
				
*/
		int A =10; 
		int B =8;
		int C =6;
		int sum = 0;
		
		do {
			if(A<C) {
				for(; sum<A; sum++) {
					for(int i = 0; i<C; i++){
						A = C+B;
						A--;
					}
				}
			}else {
				while(A>B) {
					sum = A+B-C;
					B++;
				}
			}
			A++;
		}while(A<B);
		sum += A;
		System.out.println(sum);
	}

}

