public abstract class IngredienteDecorator implements Bebida {
    protected Bebida bebida;
    
    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
    
    
    public String getDescricao() {
        return bebida.getDescricao();
    }

    
    public double calculaCusto() {
        return bebida.calculaCusto();
    }
}
