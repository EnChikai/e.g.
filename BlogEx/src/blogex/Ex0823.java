package blogex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex0823 {

	public static void main(String[] args) {
		

/*
1.	아래의 코드가 올바르게 작동하도록 try-catch 하시오.
		
*/	
			
		Scanner sc = new Scanner(System.in);
		File file1 = new File("./src/blogex/","Ex0823_1.txt");
		File file2 = new File("./src/blogex/","Ex0823_2.txt");
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		byte[] buf = new byte[1024]; //임시 저장소
		int len = -1; //입출력 길이(크기)
		
		
		System.out.println(" - - - 글자를 입력하세요 - - -");
		System.out.print( " >> ");

		
		try (BufferedOutputStream sOut = new BufferedOutputStream(new FileOutputStream(file1))){
			
			String data = sc.nextLine();
			
			sOut.write(data.getBytes(), 0, data.length());
			sOut.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			
			bis = new BufferedInputStream(new FileInputStream(file1));
			bos = new BufferedOutputStream(new FileOutputStream(file2));
			
			while ((len = bis.read(buf)) != -1) {

			bos.write(buf, 0, len);
			bos.flush();
			
			}
			
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
			try {
				if(bos != null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		sc.close();
		
	}

}

