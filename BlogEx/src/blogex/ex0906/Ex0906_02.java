package blogex.ex0906;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex0906_02 extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
		
	Image image;
	int x;
	int y;
	int i = 7;

	public Ex0906_02() {
		super("방향 Test용");
				
		addKeyListener(this);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("../BlogEx/src/blogex/ex0906/rabbit2.png"));

		setSize(300,300);

		x = (int)getWidth() / 2;
        y = (int)getHeight() / 2;
        
		setLayout(null);
		setResizable(true);
		setBackground(Color.WHITE);
		
	}

	@Override
	public void paint(Graphics g) {
		
         image = Toolkit.getDefaultToolkit().getImage("../BlogEx/src/blogex/ex0906/rabbit2.png"); 
        
         g.clearRect(0, 0, getWidth(), getHeight()); 
         g.drawImage(image, (x - image.getWidth(this)/2), (y - image.getHeight(this)/2), this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
			if(key == e.VK_RIGHT ) {
				x = (x < getWidth()) ? x + i : -image.getWidth(this);

			}else if(key == e.VK_LEFT ) {
				x = (x > 0) ? x - i :getWidth() + image.getWidth(this);
				 
			}else if(key == e.VK_UP ) {
				y = (y > 0) ? y - i : getHeight() + image.getHeight(this);
				 
			}else if(key == e.VK_DOWN ) {
				y = (y < getHeight()) ? y + i : -image.getHeight(this);

			}
			
		repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	
}
