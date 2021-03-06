
public class Q2 {

	public static void main(String[] args) {
		Account_Details sv = new Account_Details("Ernest", "ACC02022", 7000.34,
				500000.234, 100000, 250000);
		sv.display();
	}

}

class Account {
	private String customer_name;
	private String account_no;

	public Account(String customer_name, String account_no) {
		this.customer_name = customer_name;
		this.account_no = account_no;
	}
	public void display() {
		System.out.println("Customer name: " + customer_name + "\nAccount number: "+ account_no);
	}
}


class Saving_Account extends Account {
	private double min_bal;
	private double saving_bal;

	public Saving_Account(String customer_name, String account_no, double min_bal, 
			double saving_bal) {

		super(customer_name, account_no);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;

	}
	public void display() {
		super.display(); 
		System.out.println( "Minimum balance: "+ min_bal +"\nSaving balance:"
				+ saving_bal);
	}
}

class Account_Details extends Saving_Account{
	private double deposits;
	private double withdrawals;

	Account_Details(String customer_name, String account_no, double min_bal, 
			double saving_bal, double deposits, double withdrawals) {

		super(customer_name, account_no, min_bal, saving_bal);
		this.deposits = deposits;
		this.withdrawals = withdrawals;
	}
	public void display() {
		super.display();
		System.out.println("Deposits: "+ deposits +"\nWithdrawals: "+ withdrawals);
	}
}













