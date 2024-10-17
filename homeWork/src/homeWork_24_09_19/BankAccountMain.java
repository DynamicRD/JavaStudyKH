package homeWork_24_09_19;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("김동욱",60000,12345678);
		System.out.println(bankAccount.toString());
		bankAccount.deposit(10000);
		bankAccount.withdraw(20000);
	}

}
