package co.edureka.model;

public class TV extends Product{ // IS-A

	// Attributes
	Integer screenSize;
	String type;
	
	public TV() {
	
	}

	public TV(Integer screenSize, String type) {
		this.screenSize = screenSize;
		this.type = type;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + ", type=" + type + "]";
	}
	
}
