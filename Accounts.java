
public class Accounts {

	protected String accountNumber;
	protected double balance;

	public void doWithdraw(double amount) {
		balance = balance - amount;
	}

	public void doDeposit(double amount) {
		balance = balance + amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
