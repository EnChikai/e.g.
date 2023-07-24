
//2023.07.10

package blogex.ex0710;

public class Ex0710 {

	public static void main(String[] args) {

/*
1. 일반클래스(기능클래스)2개, 실행클래스 1개를 만드시오.
2. 첨부파일을 참고하여 아래와 같이 출력되도록 프로그래밍 하시오

- - - - - - - - 가게 정보 - - - - - - - -
이름			번호			메뉴갯수
중국집			02-321-6547		3		
- - - - - - - - 메뉴 정보 - - - - - - - -
번호			이름			메뉴가격
1. 				짜장면			3,000		
2. 				짬뽕			3,500		
3. 				탕수육			12,000		

*/		
			DeliveryService DS = new DeliveryService();
			
			DS.insertNameNumber();	//가게 이름, 전화번호
			
			DS.insertScore();	//가게메뉴, 가격
			
			DS.printStoreInfo();	//가게정보 출력
	}

}

