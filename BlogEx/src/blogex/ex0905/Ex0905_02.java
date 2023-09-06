package blogex.ex0905;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ex0905_02 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Ex0905_02() {
		super("Image Test용");
		JLabel label;
		setLayout(new FlowLayout());
		setResizable(false);
		
		Icon img = new ImageIcon(getClass().getResource("rabbit.png"));
		label = new JLabel("",img,SwingConstants.CENTER);
		add(label);
		
	}

}

