package blogex;

public class StarCreat {
	
	private int hight;
	
	public StarCreat(int hight) {
		this.hight = hight;
		
		//Up
		for(int i=0 ; i<hight/2 ; i++) {
			for(int j=hight/2 ; j>i ; j--) {
				System.out.print("*");
			}
			for(int j=0 ; j<i*2+1 ; j++) {
				System.out.print(" ");
			}
			for(int j=hight/2 ; j>i ; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		//down
		for(int i=0 ; i<hight/2 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			for(int j=hight-(i+1); j>i ; j--) {
				System.out.print(" ");
			}
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public int getHight() {
		return hight;
	}

	public void HIGHT(int hight) {
		this.hight = hight;
	}
	
}