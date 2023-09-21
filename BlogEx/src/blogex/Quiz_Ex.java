package blogex;

import java.util.Scanner;

public class Quiz_Ex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("t2 값 입력 : ");
		String t2=sc.nextLine();
		
		System.out.println("t3 값 입력 : ");
		String t3=sc.nextLine();
		
		Quiz t1 = new Quiz();
		
		System.out.println(t1.method(t2,t3));
		
		sc.close();
	}
}
