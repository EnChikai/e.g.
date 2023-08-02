package blogex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex0802 {

	public static void main(String[] args) {

/*
  
1. FileInputStream과 FileOutputStream을 사용하여 "img1.png"파일을
   "img2.png"명으로 복사하시오
  
2. 복사성공시와 실패시 보기와 같이 출력하도록 프로그램하시오  

성공시:
- - - 파일 복사 프로젝트 - - -
>> 151,949바이트
파일 복사 완료
  	
실패시:
- - - 파일 복사 프로젝트 - - -
>> 파일 복사 실패
  	
 */

		// 복사하려는 파일
		File file1 = new File("./src/blogex/", "img1.png");

		// 붙여넣을 파일
		File file2 = new File("./src/blogex/", "img2.png");

		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;

		try (FileInputStream readFile = new FileInputStream(file1);
				FileOutputStream saveFile = new FileOutputStream(file2)) {

			while ((len = readFile.read(buf)) != -1) {

				saveFile.write(buf, 0, len);

				total += len;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (file2.exists() == true) {
			System.out.println("- - - 파일 복사 프로젝트 - - -");
			System.out.println(">> " + String.format("%,d", total) + "바이트\n파일 복사 완료");
		} else {
			System.out.println("- - - 파일 복사 프로젝트 - - -");
			System.out.println(">> 파일 복사 실패");
		}

	}

}

