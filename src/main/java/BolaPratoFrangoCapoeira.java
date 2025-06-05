public class BolaPratoFrangoCapoeira implements FactorySanduba{

    @Override
    public Sanduiche criarSanduiche() {
        Pao pao = new Pao("Bola");
        Queijo queijo = new Queijo("Prato");
        Presunto presunto = new Presunto("Frango");
        Ovo ovo = new Ovo("Capoeira");
        Tomate tomate = new Tomate();
        return new SanduicheConcreto(pao, tomate, queijo, presunto, ovo);
    }
}
