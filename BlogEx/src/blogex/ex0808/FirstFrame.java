package blogex.ex0808;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame  {
	
	public void screen(){
	
		JFrame frame = new JFrame();
		
		frame.setSize(360, 280);
		frame.setTitle("First Open");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.getContentPane().setBackground(Color.white);
		
		JLabel label = new JLabel();
		label.setText("Hello World");
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.getContentPane().add(label);		
		
	}
}

