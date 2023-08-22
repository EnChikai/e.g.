package blogex;

public class Ex0822 {

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "   ";
		
		for(int i = 0; i<3; i++) {
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println();
		
		System.out.println(str1.concat("D"));
		System.out.println(str1.contains("A"));
		System.out.println(str1.endsWith("C"));
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());
		
	}

}
