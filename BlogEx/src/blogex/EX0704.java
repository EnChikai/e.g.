
//2023.07.04

package blogex;

public class EX0704 {

	public static void main(String[] args) {

/*
1.	올바른 비트 연산자를 대입하시오
*/		
		//1번 문제
		int num1 = 12;
		int num2 = 27;
		int result = num1  |  num2; 
		System.out.println("1번 : " + result); //-> result = 31	
		
		//2번 문제
		num1 = 30;
		num2 = 15;
		result = num1  ^  num2; 
		System.out.println("2번 : " + result); //-> result = 17
		
		//3번 문제
		num1 = 10;
		num2 = 10;
		result = num1  &  num2; 
		System.out.println("3번 : " + result);	//-> result = 10	
		
		//4번 문제
		result = 30;
		result =  ~  result; 
		System.out.println("4번 : " + result);	//-> result = -31
		
		//5번 문제
		int num = 15;
		result = num  <<  3; 
		System.out.println("5번 : " + result);	//-> result = 120	
		
		//6번 문제
		num = 15;
		result = num  >>>  2;  
		System.out.println("6번 : " + result);	//-> result = 3
		
		//7번 문제
		num1 = 50;
		num2 = 100;
		String choice = (num1  <  num2)  ?  "True"  :  "False"; 
		System.out.println("7번 : " + choice);	//-> choice = True			
		
	}

}
