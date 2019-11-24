package com.rest.api.restapi.account.controllers;

import com.rest.api.restapi.account.entities.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class IndexControllerIntegrationTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void accountListEmptyByDefault() {
        ResponseEntity<ArrayList> entity = template.getForEntity("/", ArrayList.class);
        ArrayList<Account> list = entity.getBody();
        assertEquals(0, list.size());
    }

    @Test
    public void postAccountSuccessfully() {
        HttpEntity<Account> request = new HttpEntity<>(new Account("my account"));
        ResponseEntity<Account> entity = template.postForEntity("/", request, Account.class);

        Account account = entity.getBody();

        assertEquals(account.getDescription(), "my account");
    }

    @Test
    public void listAccountCreated() {
        HttpEntity<Account> request = new HttpEntity<>(new Account("my account"));
        template.postForEntity("/", request, Account.class);

        ResponseEntity<ArrayList> entity = template.getForEntity("/", ArrayList.class);
        ArrayList<Account> list = entity.getBody();
        assertEquals(1, list.size());
    }
}
