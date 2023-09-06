package blogex.ex0905;

import javax.swing.JFrame;

public class Ex0905_01 {

	public static void main(String[] args) {
/*
		  
1.	label과 Icon을 사용하여 사진파일을 새창으로 출력하는 클래스를 만들고
	extends JFrame를 적용후 별도의 클래스에서 함수로서 이를 출력하시오
	(단, 창 크기는 변경 불가능하게 하시오)	
*/
		JFrame frame = new Ex0905_02();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(405,340);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}
