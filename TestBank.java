public class TestBank {
	public static void main(String[] args) {

		Bank bank = new Bank("GCU Bank");
		Savings savings = new Savings(5000.00, "191923");
		Checking checking = new Checking(5000.00, "991773");

		bank.displayMenu(checking, savings);

	}
}
