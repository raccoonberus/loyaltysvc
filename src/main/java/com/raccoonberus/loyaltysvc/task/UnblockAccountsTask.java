package com.raccoonberus.loyaltysvc.task;

import com.raccoonberus.loyaltysvc.dao.AccountDao;
import com.raccoonberus.loyaltysvc.dao.ActivationDao;
import com.raccoonberus.loyaltysvc.model.Account;
import com.raccoonberus.loyaltysvc.model.Activation;
import com.raccoonberus.loyaltysvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class UnblockAccountsTask {

//    @Autowired
//    private ActivationDao activationDao;

    @Autowired
    private AccountService accountService;

    @Scheduled(cron = "*/${raccoonberus.loyaltysvc.unblock-task-period} * * * * *")
    public void exec() {
        // TODO: implement me!!!

        int limit = Integer.parseInt(System.getProperty(
                "raccoonberus.loyaltysvc.unblock-limit"
        ));
//        List<Account> accounts = accountService.getBlocked(limit);


        // read property "raccoonberus.loyaltysvc.attempts-number" as AtNum
        // read property "raccoonberus.loyaltysvc.block-period" as BlPrd
        // getFree last FAIL_INVALID_CODE
        // check every user
        // if someone has more AtNum, block Account until now+BlPrd
    }

}
