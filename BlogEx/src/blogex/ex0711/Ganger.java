
//2023.07.11

package blogex.ex0711;

public class Ganger extends Doppel{
	
	public Ganger(){}
	
	public Ganger(int num1, int num2) {
		super(num1,num2);
		
	}
	
	@Override
	public int sum() {
		int nums = super.num1 + super.num2;
		return nums;
	}
	
}


