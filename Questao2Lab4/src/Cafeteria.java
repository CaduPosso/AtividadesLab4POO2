public class Cafeteria {
    public static void main(String[] args) {
    	
        // Café Espresso com Leite e Chocolate
        Bebida espressoComLeiteEChocolate = new Chocolate(new Leite(new Espresso()));
        System.out.println("Bebida: " + espressoComLeiteEChocolate.getDescricao());
        System.out.println("Custo: R$" + espressoComLeiteEChocolate.calculaCusto());

        // Café Descafeinado com Canela e Leite
        Bebida descafeinadoComCanelaELeite = new Leite(new Canela(new Decaf()));
        System.out.println("Bebida: " + descafeinadoComCanelaELeite.getDescricao());
        System.out.println("Custo: R$" + descafeinadoComCanelaELeite.calculaCusto());

        // Café Espresso com Chocolate
        Bebida espressoComChocolate = new Chocolate(new Espresso());
        System.out.println("Bebida: " + espressoComChocolate.getDescricao());
        System.out.println("Custo: R$" + espressoComChocolate.calculaCusto());
    }
}
