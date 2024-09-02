package gianlucamessina.BE_U2_S1_L1;

import gianlucamessina.BE_U2_S1_L1.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L1.entities.Pizza;
import gianlucamessina.BE_U2_S1_L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlimentiConfig {
    @Bean
    public Topping getCrudoTopping(){
        return new Topping("Prosciutto Crudo",150,1.00);
    }
    @Bean
    public Topping getBurrataTopping(){
        return new Topping("Burrata",400,2.00);
    }
    @Bean
    public Topping getCipollaTopping(){
        return new Topping("Cipolla",20,0.50);
    }
    @Bean
    public Topping salamePiccanteTopping(){
        return new Topping("Salame piccante",80,1);
    }
    @Bean
    public Bevanda getAcquaNaturaleBevanda(){
        return new Bevanda("Acqua Naturale",0,2.00,1);
    }
    @Bean
    public Bevanda getAcquaFrizzanteBevanda(){
        return new Bevanda("Acqua Frizzante",0,2.50,1);
    }
    @Bean
    public Bevanda getCocaColaBevanda(){
        return new Bevanda("Coca-Cola",139,2.50,0.30);
    }
    @Bean
    public Pizza getPizzaSanDaniele(Topping topping){
        return new Pizza("San Daniele",900,9.00,topping);
    }
    @Bean
    public Pizza getDiavola(Topping topping){
        return new Pizza("Diavola",930,8.00,topping);
    }

}
