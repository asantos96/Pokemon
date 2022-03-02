package com.company;

import java.util.HashMap;

public class BasePokemon {
    private String name;
    private String color;
    private double weight;
    private int level;
    private int healthPoints;
    private int experience;
    private int maxHealthPoints;
    private HashMap<String, Integer> attackMoves = new HashMap<String, Integer>();

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

    //Constructor for BasePokemon

    public BasePokemon (String name, String color, double weight, int level, int healthPoints, int experience,
                        int maxHealthPoints, HashMap<String, Integer> attackMoves) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.level = level;
        this.healthPoints = healthPoints;
        this.experience = experience;
        this.maxHealthPoints = maxHealthPoints;
        this.attackMoves = attackMoves;
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
