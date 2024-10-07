public class Canela extends IngredienteDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

   
    public String getDescricao() {
        return bebida.getDescricao() + " com Canela";
    }

   
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.5;
    }
}