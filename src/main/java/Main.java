public class Main {
    public static void main(String[] args) {
        // Criando os sanduíches usando diferentes fábricas
        FactorySanduba factory1 = new BolaFactory();
        Sanduiche sanduiche1 = factory1.criarSanduiche();
        sanduiche1.montar();
        System.out.println(sanduiche1);

        FactorySanduba factory2 = new IntegralFactory();
        Sanduiche sanduiche2 = factory2.criarSanduiche();
        sanduiche2.montar();
        System.out.println(sanduiche2);

        FactorySanduba factory3 = new FrancesFactory();
        Sanduiche sanduiche3 = factory3.criarSanduiche();
        sanduiche3.montar();
        System.out.println(sanduiche3);

    }
}
