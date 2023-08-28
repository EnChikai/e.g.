
//2023.07.06

package blogex;

public class Ex0706 {

	public static void main(String[] args) {

/*

1. 아래 보기의 배열을 제어문을 사용하여 낮은순부터 정렬하시오.
	
	int[][] arr2D = {{9,78,35,45,8},{4,7,100,70,89},{7,78,789,528,40}}; 
	
EX)
- - - - - - - - 정열 전 - - - - - - - -
9      78       35       45      8
4      7        100      70      89
7      78       789      528     40
- - - - - - - - 정렬 후 - - - - - - - -
8      9        35       45      78	
4      7        70       89      100	
7      40       78       528     789 
	
*/		

		int[][] arr2D = {{9,78,35,45,8},{4,7,100,70,89},{7,78,789,528,40}}; 
		
		//-------------------------------------------------------------------

		System.out.println("- - - - - - - - 정렬 전 - - - - - - - -");
		
		for(int j = 0 ; j<arr2D.length; j++){
			for(int i = 0 ; i<arr2D.length+2; i++){
				System.out.print(arr2D[j][i] + "\t");
			}
			System.out.println();
		}
				
		System.out.println();
		
		//-------------------------------------------------------------------

		System.out.println("- - - - - - - - 정렬 후 - - - - - - - -");
		
		
		for(int k = 0 ; k < arr2D.length ; k++) {
			for(int q = 0 ; q < arr2D.length+1 ; q++) {
				for(int j = 0 ; j<arr2D.length+1-q ; j++){
			
					if(arr2D[k][j] > arr2D[k][j+1]) {
				
						int tmp = arr2D[k][j];
						arr2D[k][j] = arr2D[k][j+1];
						arr2D[k][j+1] = tmp;
					}
				}
				
			}
		}
				
		System.out.println();
		
		//-------------------------------------------------------------------

		for(int j = 0 ; j<arr2D.length; j++){
			for(int i = 0 ; i<arr2D.length+2; i++){
				System.out.print(arr2D[j][i] + "\t");
			}
			
			System.out.println();
		}
		
	}

}
