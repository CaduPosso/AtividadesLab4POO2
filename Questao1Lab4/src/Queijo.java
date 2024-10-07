public class Queijo extends ToppingDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    
    public double getCusto() {
        return pizza.getCusto() + 2.0;
    }
}