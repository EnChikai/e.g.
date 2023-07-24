package blogex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex0720 {

	public static void main(String[] args) {
		
/*
1. "BufferedOutputStream"을 사용하여 "./src/blogex/","Ex0719_1.txt" 해당경로에 파일을 생성 후
	해당 .txt 파일에 Scanner를 써서 "Hello World"를 출력하시오
2. "Ex0719_1.txt"에 출력된 내용을 "Ex0719_2.txt"파일을 만들고 내용을 복사하시오
	
*/
		Scanner sc = new Scanner(System.in);
		File file1 = new File("./src/blogex/","Ex0719_1.txt");
		File file2 = new File("./src/blogex/","Ex0719_2.txt");
		
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
		
		
	}

}


