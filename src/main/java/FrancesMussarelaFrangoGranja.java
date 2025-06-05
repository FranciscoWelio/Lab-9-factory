public class FrancesMussarelaFrangoGranja implements FactorySanduba{
    @Override
    public Sanduiche criarSanduiche() {
        Pao pao = new Pao("Francês");
        Queijo queijo = new Queijo("Mussarela");
        Presunto presunto = new Presunto("Frango");
        Ovo ovo = new Ovo("Granja");
        Tomate tomate = new Tomate();
        return new SanduicheConcreto(pao, tomate, queijo, presunto, ovo);
    }
}
