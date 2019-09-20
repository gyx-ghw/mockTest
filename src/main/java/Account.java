package main.java;

public class Account {
	
	    private String acountId;
	    private long balance;

	    public Account(String acountId, long balance) {
	        this.acountId = acountId;
	        this.balance = balance;
	    }

	    public void debit(long amount) {
	        this.balance-=amount;
	    }

	    public void credit(long amount) {
	        this.balance+=amount;
	    }

	    public long getBalance() {
	        return balance;
	    }
	}

