package blogex;

public class Ex0822 {

	public static void main(String[] args) {

/*
1. 출력값에 알맞은 함수를 빈칸에 대입하시오

 ①concat	②isBlank	③charAt	④isEmpty
 ⑤endsWith	⑥length	⑦contains
  
*/
		String str1 = "ABC";
		String str2 = "   ";
		String str3 = " A B C D E ";
		
		for(int i = 0; i<3; i++) {
			System.out.print(str1.charAt(i)+" "); //-> A B C 
		}
		
		System.out.println();
		
		System.out.println(str3.     length()); //-> 11
		System.out.println(str1.  concat("D")); //-> ABCD
		System.out.println(str1.contains("A")); //-> true
		System.out.println(str1.endsWith("C")); //-> true
		System.out.println(str2.    isBlank()); //-> true
		System.out.println(str2.    isEmpty()); //-> false
		
	}

}

