package com.company;

public class BasePokemon {
    private String name;
    private String color;
    private double weight;
    private int level;
    private int healthPoints;
    private int experience;
    private int maxHealthPoints;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    //After battle, this method will update experience and level up if over 100

    public void gainExperience (int experiencePoints){
        int updatedExperience = experiencePoints + experience;
        if (updatedExperience >= 100){
            int remainder = updatedExperience % 100;
            levelUp();
            experience = remainder;
        }
        else {
            experience = updatedExperience;
        }
    }
    //Updating maxHealthPoints by 5 after each battle win then replenishes healthPoints to the new max

    public void levelUp(){
        maxHealthPoints += 5;
        healthPoints = maxHealthPoints;
    }
}
