public class IntegralCheddarPeruGranja implements FactorySanduba{
    @Override
    public Sanduiche criarSanduiche() {
        Pao pao = new Pao("Integral");
        Queijo queijo = new Queijo("Cheddar");
        Presunto presunto = new Presunto("Peru");
        Ovo ovo = new Ovo("Granja");
        Tomate tomate = new Tomate();
        return new SanduicheConcreto(pao, tomate, queijo, presunto, ovo);
    }
}
