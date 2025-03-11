package org.example;
import java.io.Serializable;

public class Hero implements Serializable{
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;

    public Hero(String name, int lvl, Weapon weapon, Armor armor) {
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hero{name: " + name + ", lvl: " + lvl + ", weapon: " + weapon + ", armor: " + armor + "}";
    }


    static class Weapon implements Serializable {
        String type;
        int damage;

        public Weapon(String type, int damage) {
            this.type = type;
            this.damage = damage;
        }

        @Override
        public String toString() {
            return "Weapon{type: " + type + ", damage: " + damage + "}";
        }
    }

    static class Armor implements Serializable{
        String material;
        int defense;

        public Armor(String material, int defense) {
            this.material = material;
            this.defense = defense;
        }

        @Override
        public String toString(){
            return "Armor{material: " + material + ", defense: " + defense + "}";
        }
    }
}
