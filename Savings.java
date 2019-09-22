
public class Savings extends Accounts {
//set variables to double
	protected double minBalance;
	protected double serviceFee;
	protected double annualInterestRate;

//savings constructor (arguments balance, account)	
	Savings(double balance, String accountNumber) {
		setBalance(balance);
		setAccountNumber(accountNumber);
		setMinBalance(200);
		setServiceFee(25);
		setAnnualInterestRate(0.06);

	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

}
