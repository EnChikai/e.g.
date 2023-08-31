package blogex;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex0830 {

	public static void main(String[] args) {

/*
  
1. Scanner, JButton, JFrame, JLabel 해당 4가지를 사용하여
  콘솔창에 입력한 결과를 "불러오기 버튼을 누를시 보기와 같이
  표시되도록, "종료"버튼을 누를시 프로그램이 종료되도록 만드시오
  
  
  콘솔 입력값 : Hello world!
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  		
 */
		
		
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		
		frame.setTitle("버튼 동작 TEST");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("불러오기");
		button1.setBounds(100,10,100,25);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("종료");
		button2.setBounds(100,125,100,25);
		frame.getContentPane().add(button2);
		
		JLabel label = new JLabel();
		label.setBounds(100,50,100,50);
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		
		button1.addActionListener(event -> {
			label.setText(sc.nextLine());
			
		});
		
		button2.addActionListener(event -> {
			sc.close();
			System.exit(0);
			
		});

	}

}
