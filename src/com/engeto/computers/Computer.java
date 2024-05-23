package com.engeto.computers;

import java.time.LocalDate;

public class Computer {
    private String description;
    private int weight;
    private LocalDate purchaseDate;

    public Computer(String description, LocalDate purchaseDate, int weight) {
        this.description = description;
        this.purchaseDate = purchaseDate;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
