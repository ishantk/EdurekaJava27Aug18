package co.edureka.model;

public class LEDTV extends TV{ // IS-A Relation

	Integer wattage;
	
	public LEDTV() {
	
	}

	public LEDTV(Integer wattage) {
		this.wattage = wattage;
	}

	public Integer getWattage() {
		return wattage;
	}

	public void setWattage(Integer wattage) {
		this.wattage = wattage;
	}

	@Override
	public String toString() {
		return "LEDTV [wattage=" + wattage + "]";
	}
}
