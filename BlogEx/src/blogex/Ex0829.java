package blogex;

import java.util.Scanner;

public class Ex0829 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		double result;
		String str = null;
		
		System.out.println("- - - どれに変換しますか - - -");
		System.out.println("1. to \"Celsius\" (°F) -> (°C)");
		System.out.println("2. to \"Fahrenheit\" (°C) -> (°F)");
		
		
		for(int i = 0; i<1; i++) {	
			
			System.out.print(" >> ");
			str = sc.nextLine();
		
			if(!(str.contains("Celsius")||str.contains("celsius")
					||str.contains("Fahrenheit")||str.contains("fahrenheit")
					||str.contains("1")||str.contains("2"))) {
				System.out.println("再入力してください");
				i--;
								
			}else {
				break;
			}
		}
		
		if(str.contains("Celsius")
				||str.contains("celsius")
				||str.contains("1")) {
			System.out.println("\"Celsius\" (°F) -> (°C)");
			System.out.println("温度値を数字のみ入力してください");
			System.out.print(" >> ");
					
			celsius = sc.nextDouble();
			result = (celsius-32)/1.8;
			System.out.printf("変換の結果は『" +String.format("%.1f",result) + "°C』です");
		
		}else if(str.contains("Fahrenheit")
				||str.contains("fahrenheit")
				||str.contains("2")) {
			System.out.println("\"Fahrenheit\" (°C) -> (°F)");
			System.out.println("温度値を数字のみ入力してください");
			System.out.print(" >> ");
					
			fahrenheit = sc.nextDouble();
			result = (fahrenheit*1.8)+32;
			System.out.printf("変換の結果は『" + String.format("%.1f",result) + "°F』です");
		}
		sc.close();
	}

}
