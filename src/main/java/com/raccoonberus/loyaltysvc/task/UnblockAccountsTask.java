package com.raccoonberus.loyaltysvc.task;

import com.raccoonberus.loyaltysvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

//@Component
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
//        List<Account> accounts = accountService.inBlockedPeriodNow(limit);


        // read property "raccoonberus.loyaltysvc.attempts-number" as AtNum
        // read property "raccoonberus.loyaltysvc.doBlockTill-period" as BlPrd
        // getFree last FAIL_INVALID_CODE
        // check every user
        // if someone has more AtNum, doBlockTill Account until now+BlPrd
    }

}
