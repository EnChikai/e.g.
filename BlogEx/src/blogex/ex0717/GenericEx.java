
//2023.07.17

package blogex.ex0717;

public class GenericEx<T> {

	private T data;
	
	public T Generic(T value){
		this.data = value;
		
		return value;
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

