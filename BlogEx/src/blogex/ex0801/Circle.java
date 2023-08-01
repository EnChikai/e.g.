package blogex.ex0801;

public class Circle {
	
	private double data;
	private double result;
	
	//반지름
	public void radius(double data) {
		this.data = data;
		
		this.result = this.data*this.data*Math.PI;
	}
	
	//지름
	public void diameter(double data) {
		this.data = data;
		
		this.result = Math.pow((this.data/2),2)*Math.PI;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
}
