package blogex.mahjong;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TransImage extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JLabel label;
	
	public TransImage(int num){
		super("마작!");
		setLayout(new FlowLayout());
		
//		for(int i =0; i<33; i++){
//			Icon t00 = new ImageIcon(getClass().getResource("./tiles/%s.png"), String.valueOf(i));
//						label = new JLabel("",t00,SwingConstants.CENTER);
//						add(label);
//						break;
//			}
		
		switch(num) {
		case 0: 
			Icon t00 = new ImageIcon(getClass().getResource("./tiles/00.png"));
			label = new JLabel("",t00,SwingConstants.CENTER);
			add(label);
			break;
		case 1: 
			Icon t01 = new ImageIcon(getClass().getResource("./tiles/01.png"));
			label = new JLabel("",t01,SwingConstants.CENTER);
			add(label);
			break;
		case 2: 
			Icon t02 = new ImageIcon(getClass().getResource("./tiles/02.png"));
			label = new JLabel("",t02,SwingConstants.CENTER);
			add(label);
			break;
		case 3: 
			Icon t03 = new ImageIcon(getClass().getResource("./tiles/03.png"));
			label = new JLabel("",t03,SwingConstants.CENTER);
			add(label);
			break;
		case 4: 
			Icon t04 = new ImageIcon(getClass().getResource("./tiles/04.png"));
			label = new JLabel("",t04,SwingConstants.CENTER);
			add(label);
			break;
		case 5: 
			Icon t05 = new ImageIcon(getClass().getResource("./tiles/05.png"));
			label = new JLabel("",t05,SwingConstants.CENTER);
			add(label);
			break;
		case 6: 
			Icon t06 = new ImageIcon(getClass().getResource("./tiles/06.png"));
			label = new JLabel("",t06,SwingConstants.CENTER);
			add(label);
			break;
		case 7: 
			Icon t07 = new ImageIcon(getClass().getResource("./tiles/07.png"));
			label = new JLabel("",t07,SwingConstants.CENTER);
			add(label);
			break;
		case 8: 
			Icon t08 = new ImageIcon(getClass().getResource("./tiles/08.png"));
			label = new JLabel("",t08,SwingConstants.CENTER);
			add(label);
			break;
		case 9: 
			Icon t09 = new ImageIcon(getClass().getResource("./tiles/09.png"));
			label = new JLabel("",t09,SwingConstants.CENTER);
			add(label);
			break;
		case 10: 
			Icon t10 = new ImageIcon(getClass().getResource("./tiles/10.png"));
			label = new JLabel("",t10,SwingConstants.CENTER);
			add(label);
			break;
		case 11: 
			Icon t11 = new ImageIcon(getClass().getResource("./tiles/11.png"));
			label = new JLabel("",t11,SwingConstants.CENTER);
			add(label);
			break;
		case 12: 
			Icon t12 = new ImageIcon(getClass().getResource("./tiles/12.png"));
			label = new JLabel("",t12,SwingConstants.CENTER);
			add(label);
			break;
		case 13: 
			Icon t13 = new ImageIcon(getClass().getResource("./tiles/13.png"));
			label = new JLabel("",t13,SwingConstants.CENTER);
			add(label);
			break;
		case 14: 
			Icon t14 = new ImageIcon(getClass().getResource("./tiles/14.png"));
			label = new JLabel("",t14,SwingConstants.CENTER);
			add(label);
			break;
		case 15: 
			Icon t15 = new ImageIcon(getClass().getResource("./tiles/15.png"));
			label = new JLabel("",t15,SwingConstants.CENTER);
			add(label);
			break;
		case 16: 
			Icon t16 = new ImageIcon(getClass().getResource("./tiles/16.png"));
			label = new JLabel("",t16,SwingConstants.CENTER);
			add(label);
			break;
		case 17: 
			Icon t17 = new ImageIcon(getClass().getResource("./tiles/17.png"));
			label = new JLabel("",t17,SwingConstants.CENTER);
			add(label);
			break;
		case 18: 
			Icon t18 = new ImageIcon(getClass().getResource("./tiles/18.png"));
			label = new JLabel("",t18,SwingConstants.CENTER);
			add(label);
			break;
		case 19: 
			Icon t19 = new ImageIcon(getClass().getResource("./tiles/19.png"));
			label = new JLabel("",t19,SwingConstants.CENTER);
			add(label);
			break;
		case 20: 
			Icon t20 = new ImageIcon(getClass().getResource("./tiles/20.png"));
			label = new JLabel("",t20,SwingConstants.CENTER);
			add(label);
			break;
		case 21: 
			Icon t21 = new ImageIcon(getClass().getResource("./tiles/21.png"));
			label = new JLabel("",t21,SwingConstants.CENTER);
			add(label);
			break;
		case 22: 
			Icon t22 = new ImageIcon(getClass().getResource("./tiles/22.png"));
			label = new JLabel("",t22,SwingConstants.CENTER);
			add(label);
			break;
		case 23: 
			Icon t23 = new ImageIcon(getClass().getResource("./tiles/23.png"));
			label = new JLabel("",t23,SwingConstants.CENTER);
			add(label);
			break;
		case 24: 
			Icon t24 = new ImageIcon(getClass().getResource("./tiles/24.png"));
			label = new JLabel("",t24,SwingConstants.CENTER);
			add(label);
			break;
		case 25: 
			Icon t25 = new ImageIcon(getClass().getResource("./tiles/25.png"));
			label = new JLabel("",t25,SwingConstants.CENTER);
			add(label);
			break;
		case 26: 
			Icon t26 = new ImageIcon(getClass().getResource("./tiles/26.png"));
			label = new JLabel("",t26,SwingConstants.CENTER);
			add(label);
			break;
		case 27: 
			Icon t27 = new ImageIcon(getClass().getResource("./tiles/27.png"));
			label = new JLabel("",t27,SwingConstants.CENTER);
			add(label);
			break;
		case 28: 
			Icon t28 = new ImageIcon(getClass().getResource("./tiles/28.png"));
			label = new JLabel("",t28,SwingConstants.CENTER);
			add(label);
			break;
		case 29: 
			Icon t29 = new ImageIcon(getClass().getResource("./tiles/29.png"));
			label = new JLabel("",t29,SwingConstants.CENTER);
			add(label);
			break;
		case 30: 
			Icon t30= new ImageIcon(getClass().getResource("./tiles/30.png"));
			label = new JLabel("",t30,SwingConstants.CENTER);
			add(label);
			break;
		case 31: 
			Icon t31 = new ImageIcon(getClass().getResource("./tiles/31.png"));
			label = new JLabel("",t31,SwingConstants.CENTER);
			add(label);
			break;
		case 32: 
			Icon t32 = new ImageIcon(getClass().getResource("./tiles/32.png"));
			label = new JLabel("",t32,SwingConstants.CENTER);
			add(label);
			break;
		case 33: 
			Icon t33 = new ImageIcon(getClass().getResource("./tiles/33.png"));
			label = new JLabel("",t33,SwingConstants.CENTER);
			add(label);
			break;
		
		}
		
	

	}
}
