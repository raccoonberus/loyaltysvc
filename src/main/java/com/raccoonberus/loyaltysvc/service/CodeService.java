package com.raccoonberus.loyaltysvc.service;

import com.raccoonberus.loyaltysvc.model.Code;
import org.springframework.stereotype.Service;

@Service
public interface CodeService {

    Code getFree(String name);

    void activate(String codeName, String username);

}
