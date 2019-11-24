package com.rest.api.restapi.account.exceptions;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Long id) {
        super("Account not found " + id);
    }
}
