package blogex.ex0801;

public class Ex0801 {

	public static void main(String[] args) {
		
/*

1.	지름 및 반지름을 받으면 원의 넓이를 계산하는 클래스를 만드시오
2.	원의 넓이를 계산하는클래스를 이용하여 Scanner를 이용하여 보기와
	같은 형식으로 대입받아 출력하는 계산기클래스를 작성하시오
3.	해당 클래스를 메인 메소드에서 사용하시오
4. 	가능할시 계산기클래스에서 Scanner로 발생하는 오류를 try-cat하여
	올바른 값을 입력할때까지 반복하게 만드시오
	
보기1:									|보기2:	
- - - - 원의 넓이 계산기 - - - -		|- - - - 원의 넓이 계산기 - - - -
기입하고자 하는 값을 선택하세요.		|기입하고자 하는 값을 선택하세요.
[1. 지름], [2. 반지름], [0. 종료]		|[1. 지름], [2. 반지름], [0. 종료]
 >> 1									| >> 종료
										|종료합니다.
지름값을 입력해 주세요.					|
 >> 10									|
 										|
넓이는 : 78.54 입니다.					|
종료합니다.								|
										|
===========================================================================	
보기3:									|보기4:
- - - - 원의 넓이 계산기 - - - -		|- - - - 원의 넓이 계산기 - - - -
기입하고자 하는 값을 선택하세요.		|기입하고자 하는 값을 선택하세요.
[1. 지름], [2. 반지름], [0. 종료]		|[1. 지름], [2. 반지름], [0. 종료]
 >> 가나다								| >> 반지름
										|
잘못된 입력입니다. 재입력 해주세요.		|반지름값을 입력해 주세요.
 >> 									| >> 가나다
 										|
										|잘못된 입력입니다. 재입력 해주세요.
									 	|>> 
									 	|
============================================================================

 */
		
		CircleCalculator cc = new CircleCalculator(); 
		cc.Calulator();
		
	}
}

