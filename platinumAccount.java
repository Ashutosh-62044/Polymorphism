package polymorphismProject;

public class platinumAccount extends goldAccount {
   
	@Override
	public void rateOfInterest() {
		System.out.println("6% per annunm");
	}
	public static void main(String[] args) {
		 
		platinumAccount platinum = new platinumAccount();
		platinum.onlineBanking();
		platinum.rateOfInterest();
		
		goldAccount gold = new goldAccount();
		gold.onlineBanking();
		gold.rateOfInterest();
	}
}
