package com.raccoonberus.loyaltysvc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "code")
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String value;

    private Date createdAt;

    private Date updatedAt;

    private Type type;

    @ManyToOne(optional = false)
    private Account activatedBy;

    public long getId() {
        return id;
    }

    public Code setId(long id) {
        this.id = id;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Code setValue(String value) {
        this.value = value;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Code setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Code setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Code setType(Type type) {
        this.type = type;
        return this;
    }

    public Account getActivatedBy() {
        return activatedBy;
    }

    public Code setActivatedBy(Account activatedBy) {
        this.activatedBy = activatedBy;
        return this;
    }

}
