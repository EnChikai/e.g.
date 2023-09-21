package blogex;

public class Quiz {
	
	String a;
	String b;
			
	public String str1(String str1) {
		return this.a = str1;
	}
	
	public String str2(String str2) {
		return this.a = str2;
	}
	
	public String method(String t2, String t3) {
		this.a = t2;
		this.b = t3;
		
		String str3 = "Quiz [a=" + this.a + ", "+ "b=" + this.b + "]";
		
		return str3;
	}
}
