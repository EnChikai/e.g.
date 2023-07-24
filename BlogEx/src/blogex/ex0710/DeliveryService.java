
//2023.07.10

package blogex.ex0710;

import java.util.Scanner;

public class DeliveryService {

	private Store sto = new Store();
	private String[] menuName;
	private int[] price;
	
	Scanner input = new Scanner(System.in);
		
	public void insertNameNumber() {
		System.out.println("가게 이름을 입력해주세요.");
		System.out.print(" >> ");
		sto.setName(input.nextLine());
		System.out.println();
		
		System.out.println("가게 전화번호를 입력해주세요.");
		System.out.println("ex) 02-123-4567");
		System.out.print(" >> ");
		sto.setPhoneNum(input.nextLine());
		System.out.println();
	}
	
	public void insertScore() {
		System.out.println("가게 메뉴 갯수를 입력해주세요");
		System.out.print(" >> ");
		sto.setMenuNum(input.nextInt());
		
		this.menuName = new String[sto.getMenuNum()];
		this.price = new int[sto.getMenuNum()];
		System.out.println();
		input.nextLine();	//공백제거
		
		for(int i=0 ;  i<=sto.getMenuNum()-1 ; i++) {
			System.out.println((i+1) + "번째 메뉴 이름을 입력해주세요.");
			System.out.print(" >> ");
			this.menuName[i] = input.nextLine();
			System.out.println();
			
			System.out.println((i+1) + "번째 메뉴 가격을 입력해주세요.");
			System.out.print(" >> ");
			this.price[i] = input.nextInt();
			System.out.println();
			input.nextLine();	//공백제거
		}
	}
	
	public void printStoreInfo() {
		System.out.println("- - - - - - - - 가게 정보 - - - - - - - -");
		System.out.println("이름" + "\t\t" +"번호" + "\t\t" + "메뉴갯수");
		System.out.print(sto.getName()+ "\t\t");
		System.out.print(sto.getPhoneNum()+ "\t");
		System.out.println(sto.getMenuNum());
		System.out.println("- - - - - - - - 메뉴 정보 - - - - - - - -");
		System.out.println("번호" + "\t\t" +"이름" + "\t\t" + "메뉴가격");
		for(int i=0 ;  i<=sto.getMenuNum()-1 ; i++) {
			System.out.print((i+1) + ". " + "\t\t");
			System.out.print(this.menuName[i] + "\t\t");
			System.out.println(String.format("%,d",this.price[i]));

			
		}
	}
}
