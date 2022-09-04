package Game;

public class Account {
	int input; // input은 입금 , output은 출금
	static int balance = 0; // 잔액을 0으로 초기화


	public Account(int input) {
		super();
		this.input = input;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.balance += input;
		System.out.println("입금 후 잔액 : " + this.balance);
	}

	public int getBalance() {
		System.out.println("잔액조회 : " + balance);
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
