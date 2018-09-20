package co.edureka;

class Plan2G implements Plan{

	int data;
	int planPrice;
	
	public void setDataAndPlan() {
		data = 2;
		planPrice = 200; 
	}

	public void showPlan() {
		System.out.println(data+"GB Data for 2G speed is available at \u20b9"+planPrice);
	}
}

class Plan3G implements Plan{

	int data;
	int planPrice;
	
	public void setDataAndPlan() {
		data = 5;
		planPrice = 300; 
	}

	public void showPlan() {
		System.out.println(data+"GB Data for 3G speed is available at \u20b9"+planPrice);
	}
}

class Plan4G implements Plan{

	int data;
	int planPrice;
	
	public void setDataAndPlan() {
		data = 10;
		planPrice = 500; 
	}

	public void showPlan() {
		System.out.println(data+"GB Data for 4G speed is available at \u20b9"+planPrice);
	}
}

public class PlanFactory {

	public static Plan getPlan(int type){
		
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
	
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
		}
		
		plan.setDataAndPlan();
		
		return plan;
	}
	
}
