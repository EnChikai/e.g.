package blogex.ex0809;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex0809 {

	public static void main(String[] args) {

/*
  
1. 	JFrame, JButton[], Scanner사용하며 Scanner로 버튼 갯수를 대입받으면
 	그 수만큼 프레임에 표시되도록 프로그래밍하시오.
 	

보기 :
  
Console:

버튼 갯수를 입력하세요
 >>   
  
==========================================

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  		
 */
		
		JFrame frame = new JFrame();
		JButton[] button = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버튼 갯수를 입력하세요");
		
		for(int i=0; i<1; i++) {
			try {
				
				System.out.print(" >> ");
				button = new JButton[sc.nextInt()];
				
			}catch(InputMismatchException e){
				System.err.println("\n잘못된 입력입니다. 재입력 해주세요.");
				sc.nextLine();
				i--;
			}
		}
		
		for(int i=0;i<button.length; i++) {
			button[i] = new JButton(Integer.toString(i));
			frame.add(button[i]);
			frame.setLayout(new FlowLayout());		
		}
		
		frame.setSize(360, 280);
		frame.setTitle("First Open");
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		sc.close();
	}
	
}
