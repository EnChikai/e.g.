package blogex.ex0906;

import javax.swing.JFrame;

public class Ex0906_01 {

	public static void main(String[] args) {
/*
		  
1.	label과 Icon을 사용하여 사진파일을 새창으로 출력하는 클래스를 만들고
	extends JFrame를 적용후 별도의 클래스에서 함수로서 이를 출력하시오
	(단, 창 크기는 변경 불가능하게 하시오)	
*/
		System.out.println();
		JFrame frame = new Ex0906_02();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}