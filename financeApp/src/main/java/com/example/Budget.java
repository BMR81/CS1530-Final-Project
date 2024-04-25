package com.example;

public class Budget {
    
    private int bid;
    private String name;
    private double budgetAmount;
    private double budgetSpent;
    private double budgetLeft;

    public Budget(int bid, String name, double budgetAmount, double budgetSpent){
        this.bid = bid;
        this.name = name;
        this.budgetAmount = budgetAmount;
        this.budgetSpent = budgetSpent;
        this.budgetLeft = (budgetAmount - budgetSpent);
    }

    public int getBid(){
        return this.bid;
    }
    /*getters to add; 
     * getName()
     * getBudgetAmount()
     * getBudgetSpent()
     * getBudgetLeft()
     */

    public void updateName(String name){
        this.name = name;
    }

    public void updateBudgetAmount(double budgetAmount){
        this.budgetAmount = budgetAmount;
        this.calculateBudgetLeft();
    }

    public void updateBudgetSpent(double budgetSpent){
        this.budgetSpent = budgetSpent;
        this.calculateBudgetLeft();
    }
    
    public void calculateBudgetLeft(){
        this.budgetLeft = (this.budgetAmount - this.budgetSpent);
    }

}
