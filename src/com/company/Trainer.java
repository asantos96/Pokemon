package com.company;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    List<BasePokemon> capturedPokemon = new ArrayList<>();
    List<Item> itemInventory = new ArrayList<>();

    void usePotion(BasePokemon selectedPokemon, Potion selectionPotion){
        selectedPokemon.setHealthPoints(selectedPokemon.getMaxHealthPoints() + selectionPotion.getHealValue());
    }

    public void setCapturedPokemon(List<BasePokemon> capturedPokemon) {
        this.capturedPokemon = capturedPokemon;
    }

    public void setItemInventory(List<Item> itemInventory) {
        this.itemInventory = itemInventory;
    }

    public List<BasePokemon> getCapturedPokemon() {
        return capturedPokemon;
    }

    public List<Item> getItemInventory() {
        return itemInventory;
    }
}
