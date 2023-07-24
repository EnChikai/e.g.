
//2023.06.29

package blogex;

import java.util.Scanner;

public class Ex0629 {
	
	public static void main(String[] args) {
	
/*
1.	빈칸에 올바른 것을 대입하시오

①else		②char		③else if		④Scanner		⑤close
⑥nextLine

*/
		Scanner reader = new Scanner(System.in);

		System.out.print("아래의 문제에 대한 답을 입력하시오.(맞으면 O, 틀리면 X)\n 문제 : (int)'가' == 44032\n 답 : ");
		char anser = reader.nextLine().charAt(0);
		
		if (anser == 'O') {
			System.out.println("정답입니다.");
			
		}
		else if(anser == 'X') {
			System.out.println("오답입니다.");
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		reader.close();
	}

}

