package week3.day2;


	
	public class Amazon extends CanaraBank {

	    @Override
	    public void cashOnDelivery() {
	        System.out.println("Payment Method = Cash Delivery.");
	    }

	    @Override
	    public void upiPayments() {
	        System.out.println("Payment Method = UPI");
	    }

	    @Override
	    public void cardPayments() {
	        System.out.println("Payment Method = Credit/Debit card");
	    }

	    @Override
	    public void internetBanking() {
	        System.out.println("Payment Method = Internet banking");
	    }

	    @Override
	    public void recordPaymentDetails() {
	        System.out.println("Recording payment details in Canara Bank system");
	    }

	
	    public static void main(String[] args) {
	        Amazon order = new Amazon();
	        order.cashOnDelivery();
	        order.upiPayments();
	        order.cardPayments();
	        order.internetBanking();
	        order.recordPaymentDetails();
	    }
	}


