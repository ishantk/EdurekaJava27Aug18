
public class Choices {

	public static void main(String[] args) {
		
		// Basic Cab
		int uberGoPrice = 70;
		
		// Luxurious Cab
		int uberXPrice = 73;
		
		// Use Case 1: We would like to book a cab based on price. Regular if/else
		/*if(uberXPrice > uberGoPrice){
			System.out.println("Book UberGo for Me !! Amount to be Paid: \u20b9"+uberGoPrice);
		}else{
			System.out.println("Book UberX for Me !! Amount to be Paid: \u20b9"+uberXPrice);
		}*/
		
		// Use Case 2: We would like to book luxurious cab if the price difference is just 5 INR. Regular if/else
		int priceDiff = uberXPrice - uberGoPrice;
		if(priceDiff <= 5){
			System.out.println("Since price difference is just \u20b9"+priceDiff+" Book UberX for Me !! Amount to be Paid: \u20b9"+uberXPrice);
		}else{
			System.out.println("Since price difference is just \u20b9"+priceDiff+" Book UberGo for Me !! Amount to be Paid: \u20b9"+uberGoPrice);
		}
		
		// Use Case 3: We wish to navigate on Google Maps | Nested if/else -> if/else within the if/else
		boolean enableInternet = false;  // In settings we have turned off the Internet
		boolean enableGPS = false; 		// In settings we have turned off the GPS i.e. Location Services
		
		if(enableInternet){
			if(enableGPS){
				System.out.println("You can use Google Maps to Navigate !!");
			}else{
				System.out.println("Please turn ON GPS to navigate!!");
			}
		}else{
			System.out.println("Please turn ON Internet to access google Maps!!");
		}
		
		// Use Case 4: We wish to book a cab based on the type // Ladder if/else
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int typeOfCab = uberMoto; // User Selected uber moto before booking the cab
		
		if(typeOfCab == uberGo){
			System.out.println("UberGo Booked. Arriving Soon !!");
		}else if(typeOfCab == uberX){
			System.out.println("UberX Booked. Arriving Soon !!");
		}else if(typeOfCab == uberMoto){
			System.out.println("Uber Moto Booked. Arriving Soon !!");
		}else{
			System.out.println("Please Make a Valid Selection First !!");
		}
		
		// switch case -> explore this part -> >>>>HW<<<<<
	}

}
