package blogex;

public class Quiz {
	
	String a;
	String b;
			
	public String method(Quiz t2, Quiz t3) {
		this.a = t2.a;
		this.b = t3.b;
		
		String str3 = "Quiz [a=" + this.a + ", "+ "b=" + this.b + "]";
		
		return str3;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	
	
}
