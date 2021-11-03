package Polymorphism;

public class JusPay extends OnlinePayment {
	public void moneyTransfer(String paymentApp) {
		this.paymentApp=paymentApp;
		System.out.println("Payment successful through"+paymentApp);
	}
	

}
