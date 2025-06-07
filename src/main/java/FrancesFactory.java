public class FrancesFactory implements FactorySanduba{
    @Override
    public Sanduiche criarSanduiche() {
        return new FrancesMussarelaFrangoGranja();
    }
}
