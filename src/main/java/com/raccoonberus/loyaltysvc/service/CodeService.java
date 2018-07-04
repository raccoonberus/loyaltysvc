package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.domain.Code;

public interface CodeService {

    Code getFree(String name);

    void activate(String codeName, String username);

}
