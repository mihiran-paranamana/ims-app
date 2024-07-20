package com.ims.server.itemSummary;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal dailyProfit;
    private Long soldCount;
    private Long insertedCount;
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public BigDecimal getDailyProfit() {
        return dailyProfit;
    }

    public void setDailyProfit(BigDecimal dailyProfit) {
        this.dailyProfit = dailyProfit;
    }

    public Long getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Long soldCount) {
        this.soldCount = soldCount;
    }

    public Long getInsertedCount() {
        return insertedCount;
    }

    public void setInsertedCount(Long insertedCount) {
        this.insertedCount = insertedCount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    ItemSummary() {
		this.dailyProfit = BigDecimal.ZERO;
		this.soldCount = 0L;
		this.insertedCount = 0L;
		this.date = LocalDate.now();
	}
}
