package com.raccoonberus.loyaltysvc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CodesBruteForceDetector {
    
    @Scheduled(cron = "*/10 * * * * *")
    public void detect() {
        // TODO: implement me!!!
        
        // read property "raccoonberus.loyaltysvc.attempts-number" as AtNum
        // read property "raccoonberus.loyaltysvc.block-period" as BlPrd
        // get last FAIL_INVALID_CODE
        // check every user
        // if someone has more AtNum, block Account until now+BlPrd
    }
    
}
