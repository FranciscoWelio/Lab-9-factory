public class BolaFactory implements FactorySanduba {
    @Override
    public Sanduiche criarSanduiche() {
        return new BolaPratoFrangoCapoeira();
    }
}
