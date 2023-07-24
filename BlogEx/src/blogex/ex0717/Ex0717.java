
//2023.07.17

package blogex.ex0717;

public class Ex0717 {

	public static void main(String[] args) {
/*
1. 아래의 프로그램이 정상작동하도록 Generic Class를 만드시오
   (단, 전연변수를 private로 만들것)

*/
		
		//Object Type
		GenericEx gObject = new GenericEx<>();
		gObject.setData("- " + 0 + " Data Print " + 1 +" -");
		System.out.println(gObject.getData());
		
		//int Type
		GenericEx<Integer> gInt = new GenericEx<>();
		gInt.setData(2023);
		System.out.println("Int Print : " + gInt.getData());
		
		//double Type
		GenericEx<Double> gDouble = new GenericEx<>();
		gDouble.setData(7.17);
		System.out.println("Double Print : " + gDouble.getData());
		
		//boolean Type
		GenericEx<Boolean> gBoolean = new GenericEx<>();
		gBoolean.setData(true);
		System.out.println("Boolean Print : " + gBoolean.getData());
		
		//String Type
		GenericEx<String> gString = new GenericEx<>();
		gString.setData("Monday");
		System.out.println("String Print : " + gString.getData());
		
	}

}


