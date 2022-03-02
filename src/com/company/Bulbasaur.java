package com.company;

import java.util.HashMap;
import java.util.Map;

public class Bulbasaur extends BasePokemon {

    private Map<String, Integer> bulbasaurAttackMoves = new HashMap<String, Integer>();


    //Tackle and Vinewhip moves unique to Bulbasaur


    public Bulbasaur(String name, String color, double weight, int level, int healthPoints, int experience,
                     int maxHealthPoints){
        super(name, color, weight, level, healthPoints, experience, maxHealthPoints);
        bulbasaurAttackMoves.put("Tackle" , 5);
        bulbasaurAttackMoves.put("Vinewhip" , 10);
        setAttackMoves(bulbasaurAttackMoves);
    }



}
