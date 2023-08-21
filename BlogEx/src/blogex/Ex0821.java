package blogex;

public class Ex0821 {

	public static void main(String[] args) {

		String str1 = "A";
		String str2 = "C";
		
		System.out.println(str1.compareTo(str2));
		
		Integer iNum1 = 11;
		int iNum2 = 22;
		Double dNum = (double) Math.round(Math.PI*100);
		dNum = dNum/100;
		
		System.out.println(iNum1.compareTo(iNum2));
		System.out.println(dNum.compareTo(3.14));
		
		
	}

}
