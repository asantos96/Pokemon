package com.company;

public class Potion extends Item{
    int healValue;

    public Potion(String name, int quantity, int healValue){
        super(name, quantity);
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }

    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }
}
