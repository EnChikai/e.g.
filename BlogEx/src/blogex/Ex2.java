
package blogex;

import java.util.Scanner;

public class Ex2 {

	public void Input() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("str1 입력 : ");
		String str1 = sc.nextLine();
		System.out.println("str1 입력 : ");
		String str2 = sc.nextLine();
		
		System.out.println(str1+str2);
		
		sc.close();
	}
	
	public static void main(String[] args) {
 
		Ex2 ex = new Ex2();
		ex.Input();
	
	}
}
