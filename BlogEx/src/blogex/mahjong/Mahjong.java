package blogex.mahjong;

public class Mahjong {

	public static void main(String[] args) {

		
		Shuffle shuffle = new Shuffle();
		System.out.println("─────────┤오늘의 마작 운세┣───────── ");
		System.out.print("");
		shuffle.mahjongShuffle();
		System.out.print("");
		
	}

}
