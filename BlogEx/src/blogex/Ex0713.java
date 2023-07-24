
//2023.07.13

package blogex;

public class Ex0713 {

	public static void main(String[] args) {
		
/*
1. "StringBuilder"클래스 객체를 생성하고 append를 사용하여 제작 후 
   "System.out.println"으로 아래의 이모티콘을 출력하시오.
  (단 StringBuilder 객체의 사용 전 길이, 용량과 사용 후 길이 용량도 출력하시오)
 
   
_______________
  ___________  \
 |   {\__{\   \ \
 |   /  = =\   \ \
 |  <  *  ㅅ>   \ \
 |   \  __A \___|\ \
 |___(_____)_\__|_\ \______&_
 |                |          \
 | ====           |           \
 |                |______      \
 |                / ____ \     |]
 |_______________[_/    \_]____|_]
-----------------| \____/ |----+
                  \______/
		
*/
		StringBuilder car;
		car = new StringBuilder();
		
		System.out.println("사용 전 길이 : " + car.length());	//사용 전 길이
		System.out.println("용량 : " + car.capacity()); //용량
		
		car.append("_______________\n");
		car.append("  ____________ \\\n");
		car.append(" |   {\\__{\\   \\ \\\n");
		car.append(" |   /  = =\\   \\ \\\n");
		car.append(" |  <  *  ㅅ>   \\ \\\n");
		car.append(" |   \\  __A \\___|\\ \\\n");
		car.append(" |___(_____)_\\_ |_\\ \\______&_\n");
		car.append(" |                |          \\\n");
		car.append(" | ====           |           \\\n");
		car.append(" |                |______      \\\n");
		car.append(" |                / ____ \\     |]\n");
		car.append(" |_______________[_/    \\_]____|_]\n");
		car.append("-----------------| \\____/ |----+\n");
		car.append("                  \\______/\n");
		
		car.trimToSize();
		System.out.println(car);
		System.out.println("사용 후 길이 : " + car.length());	//사용 후 길이
		System.out.println("용량 : " + car.capacity()); //용량
		
	}

}

