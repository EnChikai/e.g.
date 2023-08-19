package blogex;

public class Ex0817 {

	public static void main(String[] args) {
		
/*
1. 아래 변수를 직접 변경하지 않고 trim(), replace(), replaceAll() 
함수를 사용하여 보기와 같이 출력하시오.

함수 :
[str1 = str1:가나다라    ]
[str2 = str2:A. B. C. D. E. F. G. H. I. J. K. L. M]


보기 :
    str1:가나다라    
str1:가나다라
str2:A B C D E F G H I J K L M
str2:ABCDEFGHIJKLM
str2:A.C.E.G.I.K.M
str2:a.c.e.g.i.k.m
str2:a
str1:가나다라
true

 */	
		
		String str1 = "    str1:가나다라    ";
		System.out.println(str1);
		str1 = str1.trim();
		System.out.println(str1);
		
		String str2 = "str2:A. B. C. D. E. F. G. H. I. J. K. L. M";
		str2 = str2.replace(".","");
		System.out.println(str2);	
		str2 = str2.replace(" ","");
		System.out.println(str2);	
		str2 = str2.replaceAll("[B,D,F,H,J,L]", ".");
		System.out.println(str2);	
		str2 = str2.toLowerCase();
		System.out.println(str2);	
		str2 = str2.replaceAll("[.,c,e,g,i,k,m]", "");
		System.out.println(str2);	
		str2 = str2.replaceAll("[a]", "가나다라");
		str2 = str2.replaceAll("[2]", "1");
		System.out.println(str2);
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}
	
}

