public class Pizzaria {
    public static void main(String[] args) {
    	
        // Pizza Marguerita: Massa Fina com Queijo e Tomate
        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));
        System.out.println("Pizza: " + marguerita.getDescricao());
        System.out.println("Custo: R$" + marguerita.getCusto());

        // Pizza Portuguesa: Massa Espessa com Queijo, Ovo e Tomate
        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessaPizza())));
        System.out.println("Pizza: " + portuguesa.getDescricao());
        System.out.println("Custo: R$" + portuguesa.getCusto());
    }
}
