package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    Account get(String username);

}
