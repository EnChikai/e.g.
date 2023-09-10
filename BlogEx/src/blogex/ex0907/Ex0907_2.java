package blogex.ex0907;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex0907_2 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	static JButton button = new JButton();
	
	public Ex0907_2() {
		mainFrame();
		mainButton();
	}

	public void mainButton() {
		button.setBounds(125, 100, 50, 50);
		button.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_DOWN:
					button.setLocation(button.getX(), button.getY() + 10);
					break;
				case KeyEvent.VK_UP:
					button.setLocation(button.getX(), button.getY() - 10);
					break;
				case KeyEvent.VK_LEFT:
					button.setLocation(button.getX() - 10, button.getY());
					break;
				case KeyEvent.VK_RIGHT:
					button.setLocation(button.getX() + 10, button.getY());
					break;
				default:
					break;
				}
			}
		});
		add(button);
	}
	
	public void mainFrame() {
		setTitle("버튼 움직이기");
		setLayout(null);
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


