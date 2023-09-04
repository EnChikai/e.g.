package blogex.mahjong;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Shuffle{
/*

0 = (1)		 9 = {1}	18 = [1]	27 = |東|
1 = (2)		10 = {2}	19 = [2]	28 = |南|
2 = (3)		11 = {3}	20 = [3]	29 = |西|
3 = (4)		12 = {4}	21 = [4]	30 = |北|
4 = (5)		13 = {5}	22 = [5]	31 = |  |
5 = (6)		14 = {6}	23 = [6]	32 = |發|
6 = (7)		15 = {7}	24 = [7]	33 = |中|
7 = (8)		16 = {8}	25 = [8]	 
8 = (9)		17 = {9}	26 = [9]	 

*/

	int one = 0;
	
	public void mahjongShuffle() {
		int dummy;
		JLabel label;
		
		JFrame frame = new JFrame();
		frame.setTitle("마작!");
		
		Tiles tiles = new Tiles();
//		Random ran = new Random();
		
		int[] mahjong = new int[14];
		int[] tNum = new int[34];
		
//		for(int i = 0; i<num.length; i++) {
//			num[i] = i;
//		}
//		
//		
//		for(int i = 0; i<14; i++) {
//			mahjong[i] = num[ran.nextInt(34)];
//		}
//
		
		Map<String, String> map = new HashMap<String, String> ();

		Random ran = new Random();

		for(int i = 0; i<mahjong.length; i++) {
			int num = ran.nextInt(tNum.length);

			if(map.containsKey(String.valueOf(num))) {
				if(Integer.parseInt(map.get(String.valueOf(num))) >= 3) {
					i--;
					continue;
				}else {
					map.put(String.valueOf(num), String.valueOf( 1+Integer.parseInt(map.get(String.valueOf(num)))));
					mahjong[i] = num;

				}
			}else {
				map.put(String.valueOf(num), String.valueOf(1));
				mahjong[i] = num;

			}
			mahjong[i] = num;

		}
		
		for(int i = 0; i<mahjong.length; i++) {
			
			Arrays.sort(mahjong);
			dummy = mahjong[i]; 
			tiles.setNum(dummy);
			tiles.mahjongTiles();
			
			System.out.print(mahjong[i]+" ");
			
			frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));		
			ImageIcon image = new ImageIcon(getClass().getResource("./tiles/" + mahjong[i] + ".png"));
			Image img = image.getImage();
			img.getScaledInstance(40, 65, Image.SCALE_SMOOTH);
			ImageIcon changeIcon = new ImageIcon(img);
			
			label = new JLabel(changeIcon,SwingConstants.CENTER);
			frame.add(label);
		}
		
		System.out.println();
		JButton button = new JButton("한 번 더!");
		button.setBounds(100,10,100,25);
		frame.getContentPane().add(button);
		
		if(this.one == 0) {
			frame.setSize(1200,240);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.getContentPane().setBackground(new Color(56,88,147));
			
		}
		
		
		button.addActionListener(event -> {
			frame.setVisible(false);
			mahjongShuffle();
			
			
		});

	}
	

}
