package prob05;

public class Account {
	
	private String accountNo;
	private int balance = 0;
	
	
	public Account(String acountnNO) {
		setAccountNo(acountnNO);
		System.out.println(getAccountNo() + " 계좌가 개설되었습니다.");
	}

	
	
	//입금 메소드
	public void save(int saveNum) {
		int a= getBalance();
		setBalance(a += saveNum);
		System.out.println(getAccountNo() + " 계좌에 " + this.balance + "만원이 입금되었습니다.");
	}

	//출금메소드
	public void deposit(int depositNum) {
		int a= getBalance();
		setBalance(a -= depositNum);
		System.out.println(getAccountNo() + " 계좌에 " + depositNum + "만원이 출금되었습니다.");
	}

	
	
	//계좌번호(accountNo)와 잔고(balance) 필드의  getter, setter
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}

	

	
}
