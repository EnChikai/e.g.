
//2023.06.27

package blogex;

public class Ex0627 {

	public static void main(String[] args) {
		
/*
1. 아래 예시를 보고 int형 변수에 제시된 진수형태에 맞도록 "15"를 대입하고 이를 각각 출력하시오.
	1) int binary2 = _____	(2진법)
	2) int octal8 = _____	(8진법)
	3) int decimal10 = _____	(10진법)
	4) int hexadecimal16 = _____	(16진법)
*/
		int binary2 = 0B1111;
		int octal8 = 017;
		int decimal10 = 15;
		int hexadecimal16 = 0xF;
		
		System.out.println(binary2);
		System.out.println(octal8);
		System.out.println(decimal10);
		System.out.println(hexadecimal16);
		
/*
2. 아래의 보기를 알맞게 대입하고 "System.out.println()"를 사용하여 각각 출력하시오.

	①byte ②short ③long ④int ⑤float ⑥double ⑦char 
	---------------------------------------------------
		
	ⓐNum = 'Z'; 
	ⓑNum1 = -128, aNum2 = 127; 
	ⓒNum = 11234567899L;
	ⓓNum = 3.14F;
	ⓔNum = 3.14;
	ⓕNum = 44032;
	ⓖNum = 12345;
*/		
		byte aNum1 = -128, aNum2 = 127;
		short bNum = 12345;
		long cNum = 11234567899L;
		int dNum = 44032;
		float eNum = 3.14F;
		double fNum = 3.14;
		char gNum = 'Z';
		
		System.out.println(aNum1);
		System.out.println(aNum2);
		System.out.println(bNum);
		System.out.println(cNum);
		System.out.println(dNum);
		System.out.println(eNum);
		System.out.println(fNum);
		System.out.println(gNum);
		
	}
}
