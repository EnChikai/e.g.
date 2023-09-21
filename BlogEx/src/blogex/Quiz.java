package blogex;

public class Quiz {
	
	String a;
	String b;
			
	public String method(String str1, String str2) {
		this.a = str1;
		this.b = str2;
		String str3 = "Quiz [a=" + this.a + ", "+ "b=" + this.b + "]";
		return str3;
	}
}
