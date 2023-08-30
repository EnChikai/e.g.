package blogex;

import java.util.Scanner;

public class Ex0829_V2 {

	public static void main(String[] args) {

/*
		 
1. 제어문을 사용하여 섭씨온도와 화씨온도를 서로 변환 가능한 프로그램을 만드시오
(단, 보기와 같이 출력되어야합니다.)  



보기1:  
- - - 어느것으로 변환 하시겠습니까 - - -
1. to "Celsius" (°F) -> (°C)
2. to "Fahrenheit" (°C) -> (°F)
 >> ㅁ
재입력바랍니다
 >> 1
"Celsius" (°F) -> (°C)
온도값은 숫자만 입력해주세요
 >> 77
변환결과는『25.0°C』입니다  


보기2:
- - - 어느것으로 변환 하시겠습니까 - - -
1. to "Celsius" (°F) -> (°C)
2. to "Fahrenheit" (°C) -> (°F)
 >> 0
재입력바랍니다
 >> Fahrenheit
"Fahrenheit" (°C) -> (°F)
온도값은 숫자만 입력해주세요
 >> 25
변환 결과는『77.0°F』입니다
 
 */		
		
		
		Scanner sc = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		double result;
		String str = null;
		
		System.out.println("- - - 어느것으로 변환 하시겠습니까 - - -");
		System.out.println("1. to \"Celsius\" (°F) -> (°C)");
		System.out.println("2. to \"Fahrenheit\" (°C) -> (°F)");
		
		
		for(int i = 0; i<1; i++) {	
			
			System.out.print(" >> ");
			str = sc.nextLine();
		
			if(!(str.contains("Celsius")||str.contains("celsius")
					||str.contains("Fahrenheit")||str.contains("fahrenheit")
					||str.contains("1")||str.contains("2"))) {
				System.out.println("재입력바랍니다");
				i--;
								
			}else {
				break;
			}
		}
		
		if(str.contains("Celsius")
				||str.contains("celsius")
				||str.contains("1")) {
			System.out.println("\"Celsius\" (°F) -> (°C)");
			System.out.println("온도값은 숫자만 입력해주세요");
			System.out.print(" >> ");
					
			celsius = sc.nextDouble();
			result = (celsius-32)/1.8;
			System.out.printf("변환결과는『" + String.format("%.1f",result) + "°C』입니다");
		
		}else if(str.contains("Fahrenheit")
				||str.contains("fahrenheit")
				||str.contains("2")) {
			System.out.println("\"Fahrenheit\" (°C) -> (°F)");
			System.out.println("온도값은 숫자만 입력해주세요");
			System.out.print(" >> ");
					
			fahrenheit = sc.nextDouble();
			result = (fahrenheit*1.8)+32;
			System.out.printf("변환 결과는『" + String.format("%.1f",result) + "°F』입니다");
		}
		sc.close();
	}

}

