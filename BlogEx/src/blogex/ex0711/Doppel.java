
//2023.07.11

package blogex.ex0711;

public class Doppel {
	
	protected int num1;
	protected int num2;
	
	public Doppel(){}

	public Doppel(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int sum() {
		int nums = num1 + num2;
		return nums;
	}

}

