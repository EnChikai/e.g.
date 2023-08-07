package blogex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex0807 {

	public static void main(String[] args) {

/*
  
1.try-catch를 사용하여 아래 코드가 보기와 같이 정상출력
되도록 수정하시오

보기:
 - - - 파일 작성 - - -
 >> Hello World
파일 작성 완료
  		
 */
		
		
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
		System.out.println("파일 작성 완료");
		sc.close();
	}

}


