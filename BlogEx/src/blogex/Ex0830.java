package blogex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex0830 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setTitle("버튼 동작 TEST");
		frame.setSize(720,480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("TEST");
		
		
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel();
		label.setBounds(30,200,274,50);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		
	
	}

}
