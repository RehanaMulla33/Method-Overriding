package Polymorphism;

public class PhonePay extends OnlinePayment {
	public void moneyTransfer(String paymentApp) {
		this.paymentApp=paymentApp;
		System.out.println("Transaction successful through"+paymentApp);

}
}
