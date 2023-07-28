package blogex.mahjong;

public class Tiles {

	private int num;
	
	public Tiles() {}
	
	public Tiles(int num) {
		this.num = num;
	}
	
	public void mahjongTiles() {
		//마작패
		switch(num) {
		case 0: System.out.print("(１)");
				break;
		case 1: System.out.print("(２)");
				break;		
		case 2: System.out.print("(３)");
				break;			
		case 3: System.out.print("(４)");
				break;			
		case 4: System.out.print("(５)");
				break;			
		case 5: System.out.print("(６)");
				break;			
		case 6: System.out.print("(７)");
				break;			
		case 7: System.out.print("(８)");
				break;			
		case 8: System.out.print("(９)");
				break;			
		case 9: System.out.print("{１}");
				break;			
		case 10: System.out.print("{２}");
				break;			
		case 11: System.out.print("{３}");
				break;			
		case 12: System.out.print("{４}");
				break;			
		case 13: System.out.print("{５}");
				break;			
		case 14: System.out.print("{６}");
				break;			
		case 15: System.out.print("{７}");
				break;			
		case 16: System.out.print("{８}");
				break;			
		case 17: System.out.print("{９}");
				break;			
		case 18: System.out.print("[１]");
				break;			
		case 19: System.out.print("[２]");
				break;			
		case 20: System.out.print("[３]");
				break;			
		case 21: System.out.print("[４]");
				break;			
		case 22: System.out.print("[５]");
				break;			
		case 23: System.out.print("[６]");
				break;			
		case 24: System.out.print("[７]");	
				break;		
		case 25: System.out.print("[８]");
				break;			
		case 26: System.out.print("[９]");	
				break;		
		case 27: System.out.print("|東|");	
				break;		
		case 28: System.out.print("|南|");	
				break;		
		case 29: System.out.print("|西|");	
				break;		
		case 30: System.out.print("|北|");	
				break;		
		case 31: System.out.print("|　|");	
				break;		
		case 32: System.out.print("|發|");	
				break;		
		case 33: System.out.print("|中|");	
				break;		
		}
		
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
