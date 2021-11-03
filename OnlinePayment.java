package Polymorphism;

public class OnlinePayment {
	long mobileNo;
	String paymentApp;
	int amount;
	
	public void moneyTransfer(String paymentApp) {
		this.paymentApp=paymentApp;
		System.out.println("Transaction successful through"+paymentApp);
	}
	public void payGas() {
		System.out.println("Gas payment done successfully ");
	}
	public void payWaterbill() {
		System.out.println("WaterBill payment done successfully ");
	}
	

}
