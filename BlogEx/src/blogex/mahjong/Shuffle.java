package blogex.mahjong;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	int dummy;
	JLabel label;
	
	public void mahjongShuffle() {
		JFrame frame = new JFrame();
		frame.setTitle("마작!");
		
		Tiles tiles = new Tiles();
		Random ran = new Random();
		
		int[] mahjong = new int[14];
		int[] num = new int[34];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = i;
		}
		
		
		for(int i = 0; i<14; i++) {
			mahjong[i] = num[ran.nextInt(34)];
		}

		for(int i = 0; i<mahjong.length; i++) {
			Arrays.sort(mahjong);
			dummy = mahjong[i]; 
			tiles.setNum(dummy);
			tiles.mahjongTiles();
			
			System.out.print(mahjong[i]+" ");
			
			frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));		
			Icon image = new ImageIcon(getClass().getResource("./tiles/" + mahjong[i] + ".png"));
			label = new JLabel("",image,SwingConstants.CENTER);
			frame.add(label);
			
			
		}
		
		frame.setSize(1250,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(56,88,147));

	}
	

}
