public class Ovo extends ToppingDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

   
    public double getCusto() {
        return pizza.getCusto() + 1.0;
    }
} 	