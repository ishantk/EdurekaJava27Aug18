package co.edureka;

interface State{
	String getState();
}

class Ordered implements State{
	public String getState() {
		return "Product is Ordered";
	}
}

class Shipped implements State{
	public String getState() {
		return "Product is Shipped";
	}
}

class Delivered implements State{
	public String getState() {
		return "Product is Delivered";
	}
}

public class Product {

	State productState;

	public State getProductState() {
		return productState;
	}

	public void setProductState(State productState) {
		this.productState = productState;
	}
	
}
