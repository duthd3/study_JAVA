public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acct = new Account(1234,130);
		Account acct2 = new Account(5678, 1200);
		
		
		System.out.print("acct가 크면1, acct2가 크면 2반환:");
		System.out.println(acct.compareTo(acct2));
		
		

	}
}
