public class Chocolate extends IngredienteDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }


    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

  
    public double calculaCusto() {
        return bebida.calculaCusto() + 2.0;
    }
}