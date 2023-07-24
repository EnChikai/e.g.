package blogex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex0719 {

	public static void main(String[] args) {
		
/*
1. "BufferedOutputStream"을 사용하여 "./src/blogex/","Ex0719_1.txt" 해당경로에 파일을 생성 후
	해당 .txt 파일에 "Hello World"를 출력하시오
*/
		
		File file = new File("./src/blogex/","Ex0719_1.txt");
		System.out.println(file.exists());
		
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))){
			
			String data = "Hello World";
			
			bos.write(data.getBytes(), 0, data.length());
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

