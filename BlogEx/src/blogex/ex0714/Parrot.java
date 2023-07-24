package blogex.ex0714;

public class Parrot {

	public static void print(String word) {
		StringBuilder parrot;
		
		parrot = new StringBuilder();
		parrot.append(word);

		System.out.print("앵무새 :  " + word.substring(0, 1)+"... ");
		System.out.print(word.substring(0) + ", ");
		System.out.print(word + "!!!!");
	}
	
}

