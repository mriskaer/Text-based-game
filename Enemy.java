// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Teknik baseret på Carl-Emil Carlsen's kode fra forelæsning

import java.util.Random;

public class Enemy {
    String name;
    int health;
    int strength;

    public String getName(){
        return name;}

    public int getHealth (){
        return health;
    }
    public Enemy(String name, int strength, int health){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }
    public void takeDamage(int damage) {
        health -= damage;}

    public int dealDamage(){
        Random random = new Random();
        return random.nextInt(strength);
    }
    public boolean isAlive(){
        return health > 0;
    }
}
