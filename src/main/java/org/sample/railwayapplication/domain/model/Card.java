package org.sample.railwayapplication.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String operation;

    @Column(name = "card_limit", scale = 2, precision = 8)
    private BigDecimal limit;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() { return number; }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}