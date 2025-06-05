public class Main {
    public static void main(String[] args) {
        // Criando os sanduíches usando diferentes fábricas
        FactorySanduba factory1 = new BolaPratoFrangoCapoeira();
        Sanduiche sanduiche1 = factory1.criarSanduiche();

        FactorySanduba factory2 = new IntegralCheddarPeruGranja();
        Sanduiche sanduiche2 = factory2.criarSanduiche();

        FactorySanduba factory3 = new FrancesMussarelaFrangoGranja();
        Sanduiche sanduiche3 = factory3.criarSanduiche();

        // Descrevendo os sanduíches
        System.out.println("Sanduiche 1");
        sanduiche1.descrever();
        System.out.println("Sanduiche 2");
        sanduiche2.descrever();
        System.out.println("Sanduiche 3");
        sanduiche3.descrever();
    }
}
