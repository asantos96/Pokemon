package com.company;

import java.util.Scanner;

public class Battle {


    public void startGame() {
        System.out.println("Welcome to pokemon, what would you like as your starting pokemon Pikachu(1) or Bulbasuar(2)");
        Trainer trainer = new Trainer();

        Scanner userInput = new Scanner(System.in);
        int userSelectedPokemon = userInput.nextInt();

        Pikachu firstPikachu = new Pikachu("Pikachu", "yellow", 13, 1, 20, 0, 20);
        Bulbasaur firstBulbasaur = new Bulbasaur("Balbasaur", "Green", 15, 1, 20, 0, 0);

        if (userSelectedPokemon == 1) {
            trainer.getCapturedPokemon().add(firstPikachu);
        } else if (userSelectedPokemon == 2) {
            trainer.getCapturedPokemon().add(firstBulbasaur);
        } else {
            System.out.println("Not a valid input");
        }


    }
}
