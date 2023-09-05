package blogex.ex0905;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sun.tools.javac.Main;

public class Ex0905 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
				
		frame.setTitle("Snow Rabbit");
		frame.setSize(1280,720);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		Image img = new ImageIcon(Main.class.getResource("rabbit.png")).getImage();
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
