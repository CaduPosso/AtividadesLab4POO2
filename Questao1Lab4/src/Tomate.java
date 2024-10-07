public class Tomate extends ToppingDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

   
    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

   
    public double getCusto() {
        return pizza.getCusto() + 1.5;
    }
}