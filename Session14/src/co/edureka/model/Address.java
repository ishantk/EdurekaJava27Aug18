package co.edureka.model;

public class Address {

	Integer aid;
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	User user; // Has-A Relation : One to One
	
	public Address() {
	
	}

	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode, User user) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.user = user;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", user=" + user + "]";
	}
	
}
