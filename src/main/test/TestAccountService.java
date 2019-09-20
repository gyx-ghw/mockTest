package main.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import main.java.Account;
import main.java.AccountManager;
import main.java.AccountService;

public class TestAccountService {
	public class MockAccountManager implements AccountManager {
        private Map<String,Account> accounts = new HashMap<String,Account>();

        public void addAccount(String userId, Account account) {
            this.accounts.put(userId, account);
        }

        public Account findAccountForUser(String userId) {
            return this.accounts.get(userId);
        }

        public void updateAccount(Account account) {
            //do nothing...
        }
    }

    @Test
    public void testTransferOk(){
        MockAccountManager mockAccountManager = new MockAccountManager();

        Account senderAccount = new Account("1", 200);
        Account deneficiaryAccount = new Account("1", 100);
        mockAccountManager.addAccount("1", senderAccount);
        mockAccountManager.addAccount("2", deneficiaryAccount);
        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1","2",50);

        assertEquals(150,senderAccount.getBalance());
        assertEquals(150,deneficiaryAccount.getBalance());
    }
}
