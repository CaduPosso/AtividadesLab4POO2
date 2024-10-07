public class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.5;
    }
}