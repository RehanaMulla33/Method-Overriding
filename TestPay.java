package Polymorphism;

public class TestPay {

	public static void main(String[] args) {
		OnlinePayment payment=new OnlinePayment();
		payment.moneyTransfer("PhonePay");
		payment.payGas();
		
		JusPay juspay=new JusPay();
		payment.moneyTransfer("Google pay");
		juspay.payWaterbill();

	}

}
