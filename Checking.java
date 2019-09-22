
public class Checking extends Accounts {

	protected double overDraft;

	public Checking(double balance, String accountNumber) {
		setBalance(balance);
		setAccountNumber(accountNumber);
		setOverDraft(45.00);
		System.out.println("An overdraft fee of $45 has been assessed.");
	}

//
	public void doWithdraw(double amount) {
		balance = balance - amount;
		if (balance < 0) {
			balance = balance - overDraft;
		}
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
}
