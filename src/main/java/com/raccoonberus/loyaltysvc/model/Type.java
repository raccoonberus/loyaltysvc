package com.raccoonberus.loyaltysvc.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
@Table(name = "type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String description;

    @Column(nullable = true)
    private Date validFrom;

    @Column(nullable = true)
    private Date validTill;

    private float value;

    public String getId() {
        return id;
    }

    public Type setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Type setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Type setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public Date getValidTill() {
        return validTill;
    }

    public Type setValidTill(Date validTill) {
        this.validTill = validTill;
        return this;
    }

    public float getValue() {
        return value;
    }

    public Type setValue(float value) {
        this.value = value;
        return this;
    }
    
}
