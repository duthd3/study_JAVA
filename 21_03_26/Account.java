public class Account {

	private int acctNo;
	private int balance;
	
	public Account(int no, int bal) //생성자
	{
		acctNo = no;
		balance = bal;
	}

	
	public int getBalance()
	{
		return balance;
	}
	
	public void deposit(int amt)
	{
		balance += amt;
	}
	
	public void withdraw(int wd)
	{
		if(wd<0)
			return;
		balance -= wd;
		
	}
	
	public String toString() {
		return "Balance = " + getBalance();
	}
	
	public int compareTo(Account other)
	{
		if(this.balance>other.balance)
			return 1;
		else
			return 0;
	}

}
