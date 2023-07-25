package blogex;

public class Ex0725 {

	public static void main(String[] args) {

		
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

		System.out.println(String.format("%,d", decimal10));
		
		
	}

}
