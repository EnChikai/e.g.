package blogex;

public class Ex0821 {

	public static void main(String[] args) {

/*

1. 보기와 같이 출력되도록 빈칸에 올바른 변수를 채우시오 
  
보기 :   
0
-2
25
-----------------------------
-1
-1
1
0
  		
 */
		
		String str1 = "A";
		String str2 = "C";
		
		System.out.println(str1.compareTo("A"));
		System.out.println(str1.compareTo(str2));
		System.out.println("Z".compareTo(str1));
		
		System.out.println("-----------------------------");
		
		Integer iNum1 = 15;
		int iNum2 = 22;
		Integer iNum3;
		Double dNum = (double) Math.round(Math.PI*100);
		dNum = dNum/100;
		
		System.out.println(iNum1.compareTo(iNum2));
		System.out.println((iNum3 = 11).compareTo(iNum1));
		System.out.println(iNum1.compareTo(iNum3));
		System.out.println(dNum.compareTo(3.14));
	}

}
