package blogex.ex0906;

import javax.swing.JFrame;

public class Ex0906_01 {

	public static void main(String[] args) {
/*
		  
1.	Ex0906_02 클래스에 클래스에 JFrame을 extends하고 
	KeyListener를 implements하여 첨부된 그림파일을 방향키
	입력시 이동하게 하시오
*/
		System.out.println();
		JFrame frame = new Ex0906_02();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}

