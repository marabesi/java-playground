package com.rest.api.restapi.account.seeds;

import com.rest.api.restapi.account.entities.Account;
import com.rest.api.restapi.account.repositories.AccountRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadAccounts implements ApplicationRunner {

    private AccountRepository accountRepository;

    public LoadAccounts(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void run(ApplicationArguments args) {
        System.out.println("seeding database...");
//        accountRepository.save(new Account("account 1"));
//        accountRepository.save(new Account("account 2"));
//        accountRepository.save(new Account("account 3"));
        System.out.println("database seeded!");
    }
}
