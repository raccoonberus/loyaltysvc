package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.domain.Code;

public interface CodeService {

    void save(Code code);

    Code getFree(String name);

    void activate(String codeName, String username);

}
