package main.java;

public interface AccountManager {
	Account findAccountForUser(String userId);

    void updateAccount(Account account);
}
