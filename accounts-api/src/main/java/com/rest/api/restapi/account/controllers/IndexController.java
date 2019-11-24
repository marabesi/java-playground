package com.rest.api.restapi.account.controllers;

import com.rest.api.restapi.account.entities.Account;
import com.rest.api.restapi.account.exceptions.AccountNotFoundException;
import com.rest.api.restapi.account.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    private AccountRepository accountRepository;

    public IndexController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping(value = "/")
    public Iterable<Account> index() {
        return this.accountRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Account byId(@PathVariable Long id) {
        return this.accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
    }

    @PostMapping(value = "/")
    public Account create(@RequestBody Account account) {
        this.accountRepository.save(account);
        return account;
    }
}
