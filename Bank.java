import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	private String name = "GCU Bank";
	{
	}

	public Bank(String string) {
		// TODO Auto-generated constructor stub
	}

	public void displayMenu(Checking checking, Savings savings) {
		int option;
		do {
			System.out.println("===================================");
			System.out.println(" MAIN MENU");
			System.out.println(" " + this.name.toUpperCase());
			System.out.println("===================================");
			System.out.println("Pick an option: ");
			System.out.println("---------------------");
			System.out.println(" (1) -- Deposit to Checking");
			System.out.println(" (2) -- Deposit to Savings");
			System.out.println(" (3) -- Write a Check");
			System.out.println(" (4) -- Withdraw from Savings");
			System.out.println(" (5) -- Account Balances");
			System.out.println(" (6) -- Monthly Statement");
			System.out.println("---------------------");
			System.out.println(" (9) -- Exit");
			option = sc.nextInt();
			this.doMenuAction(option, checking, savings);
		} while (option != 9);
	}

	public void doMenuAction(int option, Checking checking, Savings savings) {
		switch (option) {
		case 1:
			displayDepositChecking(checking);
			break;
		case 2:
			displayDepositSavings(savings);
			break;
		case 3:
			displayWithdrawChecking(checking);
			break;
		case 4:
			displayWithdrawSavings(savings);
			break;
		case 5:
			displayBalanceScreen(checking, savings);
			break;
		case 6:
			doEndMonth(checking, savings);
			break;
		case 9:
			displayExitScreen();
			break;
		default:
			System.out.println("INPUT ERROR");
			break;
		}
	}

	public void displayDepositChecking(Checking checking) {
		double depositChecking;
		System.out.println("Deposit into Checking Account " + checking.getAccountNumber());
		System.out.println("Your Checking Account balance is " + checking.getBalance());
		System.out.println("How much would you like to deposit?");
		depositChecking = sc.nextDouble();
		checking.doDeposit(depositChecking);
		System.out.println("Your new balance is " + checking.getBalance());
	}

	public void displayDepositSavings(Savings savings) {
		double depositSavings;
		System.out.println("Deposit into Savings Account " + savings.getAccountNumber());
		System.out.println("Your Savings Account balance is " + savings.getBalance());
		System.out.println("How much would you like to deposit?");
		depositSavings = sc.nextDouble();
		savings.doDeposit(depositSavings);
		System.out.println("Your new balance is " + savings.getBalance());
	}

	public void displayWithdrawChecking(Checking checking) {
		double withdrawChecking;
		System.out.println("Withdraw from Checking Account " + checking.getAccountNumber());
		System.out.println("Your Checking Account balance is " + checking.getBalance());
		System.out.println("How much would you like to withdraw?");
		withdrawChecking = sc.nextDouble();
		checking.doWithdraw(withdrawChecking);
		System.out.println("Your new balance is " + checking.getBalance());
	}

	public void displayWithdrawSavings(Savings savings) {
		double withdrawSavings;
		System.out.println("Withdraw from Savings Account " + savings.getAccountNumber());
		System.out.println("Your Savings Account balance is " + savings.getBalance());
		System.out.println("How much would you like to withdraw?");
		withdrawSavings = sc.nextDouble();
		savings.doWithdraw(withdrawSavings);
		System.out.println("Your new balance is " + savings.getBalance());
	}

	public void displayBalanceScreen(Checking checking, Savings savings) {
		DecimalFormat DF = new DecimalFormat("0.00");
		System.out.println("Your Checking balance is $" + checking.getBalance());
		System.out.println("Your Savings balance is $" + savings.getBalance());
	}

	public void doEndMonth(Checking checking, Savings savings) {
		if (savings.getBalance() < savings.getMinBalance()) {
			savings.doWithdraw(savings.getServiceFee());
			DecimalFormat DF = new DecimalFormat("0.00");
			System.out
					.println("Your balance is below $" + savings.getMinBalance() + " and a $" + savings.getServiceFee()
							+ "service fee has been assessed. Your new balance is $" + savings.getBalance());
		}
		double amount = savings.getBalance() * savings.getAnnualInterestRate() / 12;
		if (savings.getBalance() > 0) {
			savings.balance = savings.getBalance() + amount;
			DecimalFormat DF = new DecimalFormat("0.00");
			DF.setRoundingMode(RoundingMode.DOWN);
			System.out.println("Your balance with interest is $" + savings.balance);
		}
	}

	public void displayExitScreen() {
		System.out.println("Thank you for using GCU Bank!");
	}

	{
	}

	{
	}
}
