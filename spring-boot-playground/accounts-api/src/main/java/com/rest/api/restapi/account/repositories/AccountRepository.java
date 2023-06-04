package com.rest.api.restapi.account.repositories;

import com.rest.api.restapi.account.entities.Account;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends CrudRepository<Account, Long> {
}
