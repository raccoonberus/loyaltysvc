package com.raccoonberus.loyaltysvc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String username;

    @Column(nullable = true)
    private Date bannedTill;

    public long getId() {
        return id;
    }

    public Account setId(long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Account setUsername(String username) {
        this.username = username;
        return this;
    }

    public Date getBannedTill() {
        return bannedTill;
    }

    public Account setBannedTill(Date bannedTill) {
        this.bannedTill = bannedTill;
        return this;
    }

}
