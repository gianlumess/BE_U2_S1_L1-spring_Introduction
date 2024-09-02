package gianlucamessina.BE_U2_S1_L1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Alimento {
    private List<Topping>toppings = new ArrayList<>();

    public Pizza(String nome, int calorie, double prezzo, Topping topping) {
        super(nome, calorie, prezzo);
        this.toppings.add(new Topping("Pomodoro", 50, 0.50));
        this.toppings.add(new Topping("Mozzarella", 100, 1.00));
        this.toppings.add(topping);
    }
}
