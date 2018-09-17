package co.edureka.model;

public class Product {

	Integer pid;
	Integer price;
	String brandName;
	
	public Product() {
	
	}

	public Product(Integer pid, Integer price, String brandName) {
		this.pid = pid;
		this.price = price;
		this.brandName = brandName;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", brandName=" + brandName + "]";
	}
	
}
