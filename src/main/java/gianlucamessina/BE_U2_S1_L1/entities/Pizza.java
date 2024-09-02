package gianlucamessina.BE_U2_S1_L1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Alimento {
    private List<Topping>toppings = new ArrayList<>();

    public Pizza(String nome, int calorie, double prezzo, List<Topping> toppings) {
        super(nome, calorie, prezzo);
        this.toppings = toppings;
    }
}
