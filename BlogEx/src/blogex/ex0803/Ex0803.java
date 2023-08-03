package blogex.ex0803;

import javax.swing.JFrame;

public class Ex0803 {
	
	public static void main(String[] args) {

/*
		  
1. label과 Icon을 사용하여 사진파일을 새창으로 출력하는 클래스를 만들고
  이를 출력하시오
		  		
*/
		
		ImgLoad imgload = new ImgLoad();
		imgload.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imgload.setSize(450,330);
		imgload.setVisible(true);
		
		
	}
}

