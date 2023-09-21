package blogex;

import java.util.Scanner;

public class Quiz_Ex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Quiz t1 = new Quiz();
		
		System.out.println("t2 값 입력 : ");
		String t2 = new Quiz().str1(sc.nextLine());
		
		System.out.println("t3 값 입력 : ");
		String t3 = new Quiz().str2(sc.nextLine());
		
		System.out.println(t1.method(t2,t3));
		
		sc.close();
	}
}
