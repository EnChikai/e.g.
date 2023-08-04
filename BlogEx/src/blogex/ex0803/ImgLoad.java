package blogex.ex0803;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class ImgLoad extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	public ImgLoad() {
		
		super("Image Test용");
		setLayout(new FlowLayout());
		
		Icon img = new ImageIcon(getClass().getResource("img.png"));
		label = new JLabel("",img,SwingConstants.CENTER);
		add(label);
		
	}
}

