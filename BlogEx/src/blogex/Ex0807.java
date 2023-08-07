package blogex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex0807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File file = new File("./src/blogex/", "Ex0807.txt");
		
		BufferedOutputStream bos = null;
		
		System.out.println(" - - - 파일 작성 - - -");
		System.out.print( " >> ");
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			String data = sc.nextLine();

			bos.write(data.getBytes(), 0, data.length());
			bos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		sc.close();
	}

}