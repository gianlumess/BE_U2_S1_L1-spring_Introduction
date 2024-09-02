package gianlucamessina.BE_U2_S1_L1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizze=new ArrayList<>();
    private List<Topping> toppings=new ArrayList<>();
    private List<Bevanda> bevande=new ArrayList<>();

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", bevande=" + bevande +
                '}';
    }
}
