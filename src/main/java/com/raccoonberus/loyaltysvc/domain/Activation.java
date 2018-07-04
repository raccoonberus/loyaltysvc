package com.raccoonberus.loyaltysvc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "activation")
public class Activation {

    public enum Status { OK, FAIL_ACTIVATED_ALREADY, FAIL_INVALID_CODE }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Code code;

    private Date activatedAt;

    private Status status;

    public long getId() {
        return id;
    }

    public Activation setId(long id) {
        this.id = id;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public Activation setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Code getCode() {
        return code;
    }

    public Activation setCode(Code code) {
        this.code = code;
        return this;
    }

    public Date getActivatedAt() {
        return activatedAt;
    }

    public Activation setActivatedAt(Date activatedAt) {
        this.activatedAt = activatedAt;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Activation setStatus(Status status) {
        this.status = status;
        return this;
    }
}
