package blogex;

public class Ex0817 {

	public static void main(String[] args) {
		
		String str = "    가나다라    ";
		str = str.trim();
		System.out.println(str);
		
		str = "A. B. C. D. E. F. G. H. I. J. K. L. M";
		str = str.replace(".","");
		System.out.println(str);	
		str = str.replace(" ","");
		System.out.println(str);	
	}
	
}
