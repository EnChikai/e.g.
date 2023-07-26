package blogex;

public class Ex0725_Integer {

	public static void main(String[] args) {

/*
 * 
 * 1. num2, num8, num16을 각각 String으로 변환 후 합계를 구하고 
 * 합계를 다시금 10진수화하여 보기와 같이 출력하시오.
 *  
 * 1001 : 2진수의 문자화
 * 21 : 8진수의 문자화
 * 1f : 16진수의 문자화
 * 문자열의 합 : 1001211f
 * - - - - - - - -
 * 합계의 10진수화 : 268,509,471
 * 
 * 
 */
		
		int num2 = 0B1001; //11
		int num8 = 021; //17
		int num16 = 0x1F; //37
		
		String binary2 = Integer.toBinaryString(num2);
		String octal8 = Integer.toOctalString(num8);
		String hexadecimal16 =Integer.toHexString(num16);
		
		System.out.println(binary2 + " : 2진수의 문자화");
		System.out.println(octal8 + " : 8진수의 문자화");
		System.out.println(hexadecimal16 + " : 16진수의 문자화");
		
		String sumString = binary2+octal8+hexadecimal16;
		
		System.out.println("문자열의 합 : " + sumString);
		
		System.out.println("- - - - - - - -");
		
		int decimal10 = Integer.parseInt(sumString, 16);

		System.out.println(String.format("합계의 10진수화 : " + "%,d", decimal10));
		
		
	}

}

