public class IntegralFactory implements FactorySanduba{
    @Override
    public Sanduiche criarSanduiche() {
        return new IntegralCheddarPeruGranja();
    }
}
