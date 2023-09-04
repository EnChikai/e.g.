package blogex.ex0904;

import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ex0904 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		JLabel label;
		
		frame.setTitle("사진 사이즈 조절");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon img = new ImageIcon("img.png");
		label = new JLabel("",img,SwingConstants.CENTER);
		frame.add(label);
		
		
		frame.setVisible(true);
	}

}
