package blogex;

import java.util.Scanner;

public class Ex0724_System_Out_Println {

	public static void main(String[] args) {

/*
1. Scanner를 사용하여 Console에 "Hello World"를 입력 및 출력하시오
 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.nextLine());
		
		sc.close();
		
	}

}

