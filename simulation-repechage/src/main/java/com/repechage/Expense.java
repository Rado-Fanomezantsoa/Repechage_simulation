package com.repechage;

import java.time.LocalDate;

public class Expense {
    private String label;
    private double amount;
    private LocalDate date;
    
    
    
    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }


    public boolean isLargeExpense(double amount){
        if (amount < 100 ) {
            return false;
        }
        return true;
    }



    public String getLabel() {
        return label;
    }



    public void setLabel(String label) {
        this.label = label;
    }



    public double getAmount() {
        return amount;
    }



    public void setAmount(double amount) {
        this.amount = amount;
    }



    public LocalDate getDate() {
        return date;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Expense [label=" + label + ", amount=" + amount + ", date: " + date + "]";
    }

    public static void main(String[] args) {
        Expense voiture = new Expense("Carburant", 10000, LocalDate.now());
        System.out.println(voiture.toString());
    }
    
}
