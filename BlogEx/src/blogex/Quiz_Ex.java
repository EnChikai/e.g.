package blogex;

import java.util.Scanner;

public class Quiz_Ex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Quiz t1 = new Quiz();
		
		System.out.println("t2 값 입력 : ");
		Quiz t2 = new Quiz();
		t2.setA(sc.nextLine());
		
		System.out.println("t3 값 입력 : ");
		Quiz t3 = new Quiz();
		t3.setB(sc.nextLine());
		
		System.out.println(t1.method(t2,t3));
		
		sc.close();
	}
}
