package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.dao.AccountDao;
import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.model.Account;
import com.raccoonberus.loyaltysvc.model.Activation;
import com.raccoonberus.loyaltysvc.model.Code;
import org.springframework.beans.factory.annotation.Autowired;

public class CodeServiceImpl implements CodeService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private CodeDao codeDao;

    @Override
    public Code getFree(String name) {
        return codeDao.get(name);
    }

    @Override
    public void activate(String codeName, String username) {
        Activation activation = new Activation();

        Account account = accountDao.getByUsername(username);
        if (null == account) {
            account = new Account();
            account.setUsername(username);
            accountDao.create(account);
        }
        activation.setAccount(account);

        Code code = this.getFree(codeName);
        activation.setCode(code);
    }
}
