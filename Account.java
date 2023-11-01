package inheritance;

class BankAccount{
	int acNo;
	String acName,acPhone,acEmail;
	double acBalance;
	public BankAccount(int acNo,String acName,String acPhone,String acEmail,double acBalance) {
		this.acNo=acNo;
		this.acName=acName;
		this.acEmail=acEmail;
		this.acPhone=acPhone;
		this.acBalance=acBalance;
	}
	public void accountholder()
	{
		System.out.println("Account Number :"+acNo);
		System.out.println("Account Holder Name :"+acName);
		System.out.println("Account Holder Address :"+acPhone);
		System.out.println("Account Holder Phone :"+acEmail);
		System.out.println("Account Holder Balance :"+acBalance);
		
	}
	public void deposit(double amount) {
		acBalance+=amount;
		System.out.println("Deposited: $"+amount);
		
	}
	public void displayBalance() {
		System.out.println("Account Number: "+acNo+"   Balance: $"+acBalance);
	}
}
class SavingsAccount extends BankAccount{
	public SavingsAccount(int acNo,String acName,String acPhone,String acEmail,double acBalance) {
		super(acNo,acName,acPhone,acEmail,acBalance);
	}
}
	class CurrentAccount extends BankAccount{
		public CurrentAccount(int acNo,String acName,String acPhone,String acEmail,double acBalance) {
			super(acNo,acName,acPhone,acEmail,acBalance);
		}
	
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("SAVINGS ACCOUNT DETAILS");
				SavingsAccount sac=new SavingsAccount(1001,"Ann Kamau","07200000","test@gmail.com",1000);
				sac.accountholder();
				sac.deposit(500);
				sac.displayBalance();
				System.out.println("");
				System.out.println("CURRENT ACCOUNT DETAILS");
				CurrentAccount cac=new CurrentAccount(1001,"Peter Smith","08100000","admin@gmail.com",0);
				cac.accountholder();
				cac.deposit(300);
				cac.displayBalance();

	}

}
