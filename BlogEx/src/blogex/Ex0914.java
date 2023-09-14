package blogex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0914 {

	public static void main(String[] args) {

/*
1. 입력받은 날짜가 오늘이면 입력한 시간이 출력되고,
"오늘 이전"일 경우 업로드 일자, "오늘 이후"일 경우 업로드 예정일자,
"동일할 경우" 시간이 표기되도록 프로그래밍 하시오. 

보기: 
 
오늘이전: 
년도 입력(yyyy)
 >> 2023
월 입력(MM)
 >> 09
일 입력(dd)
 >> 13
 	.
 	.
업로드 날짜 : 2023-09-13 
--------------------------
동일할 경우: 
년도 입력(yyyy)
 >> 2023
월 입력(MM)
 >> 09
일 입력(dd)
 >> 14
시간 입력(HH)
 >> 10
분 입력(mm)
 >> 11
초 입력(ss)
 >> 22
업로드 날짜 : 10:11
--------------------------
오늘 이후:
년도 입력(yyyy)
 >> 2023
월 입력(MM)
 >> 09
일 입력(dd)
 >> 15
 	.
 	.
업로드 날짜 : 2023-09-15 	
 */
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		int i = 0;
			for(i=0; i<1; i++) {
				try {
				System.out.print("년도 입력(yyyy)\n >> ");
				year = sc.nextInt();
				
				System.out.print("월 입력(MM)\n >> ");
				month = sc.nextInt()-1;
				
				System.out.print("일 입력(dd)\n >> ");
				day = sc.nextInt();
				
				System.out.print("시간 입력(HH)\n >> ");
				hour = sc.nextInt();
				
				System.out.print("분 입력(mm)\n >> ");
				minute = sc.nextInt();
				
				System.out.print("초 입력(ss)\n >> ");
				second = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력 바랍니다");
				System.out.println();
				i--;
				sc.nextLine();
			}
		}
		
		Date bSomeday = new GregorianCalendar(year, month, day, hour, minute, second).getTime();
		Date bToday = new GregorianCalendar().getTime();
		
		String aSomeday = new SimpleDateFormat("yyyyMMdd").format(bSomeday);
		String aToday = new SimpleDateFormat("yyyyMMdd").format(bToday);
		
		int iSomeday = Integer.parseInt(aSomeday);
		int iToday = Integer.parseInt(aToday);
		
		
		if(iSomeday<iToday){
			System.out.println("업로드 날짜 : " + new SimpleDateFormat("yyyy-MM-dd").format(bSomeday));

		}else if(iSomeday>iToday){
			System.out.println("업로드 예정 날짜 : " + new SimpleDateFormat("yyyy-MM-dd").format(bSomeday));

		}else {
			System.out.println("업로드 시간 : "+new SimpleDateFormat("HH:mm").format(bSomeday));
		}
		
		sc.close();
	}
}
