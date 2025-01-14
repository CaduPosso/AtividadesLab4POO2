public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;
    
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String getDescricao() {
        return pizza.getDescricao();
    }

    public double getCusto() {
        return pizza.getCusto();
    }
}
