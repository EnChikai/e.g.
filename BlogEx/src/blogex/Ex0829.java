package blogex;

import java.util.Scanner;

public class Ex0829 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		double result;
		
		System.out.println("- - - どれに変換しますか - - -");
		System.out.println("1. to \"Celsius\" (°F) -> (°C)");
		System.out.println("2. to \"Fahrenheit\" (°C) -> (°F)");
		
			System.out.print(" >> ");
			String str = sc.nextLine();
			
		if(!(str.contains("Celsius")||str.contains("celsius")||
				str.contains("Fahrenheit")||str.contains("fahrenheit"))) {
			System.out.println("Please re-enter");
		}

		if(str.contains("Fahrenheit")||str.contains("fahrenheit")) {
			System.out.println("온도값을 숫자만 입력하세요");
			System.out.print(" >> ");
					
			fahrenheit = sc.nextDouble();
			result = (fahrenheit-32)/1.8;
			System.out.printf("변환 결과는 "+ result + "°C 입니다");
		}else if(str.contains("섭씨")) {
			System.out.println("온도값을 숫자만 입력하세요");
			System.out.print(" >> ");
					
			celsius = sc.nextDouble();
			result = (celsius*1.8)+32;
			System.out.printf("변환 결과는 " + Math.round(result) + "°F 입니다");
		}
		sc.close();
	}

}
