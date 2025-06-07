import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanduicheFactoryTest {

    @Test
    public void testSanduicheIntegral() {
        FactorySanduba factory = new IntegralFactory();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertEquals("integral", sanduiche.pao);
        assertEquals("prato", sanduiche.queijo);
        assertEquals("frango", sanduiche.presunto);
        assertEquals("capoeira", sanduiche.ovo);
        assertEquals("sim", sanduiche.tomate);
    }

    @Test
    public void testSanduicheFrances() {
        FactorySanduba factory = new FrancesFactory();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertEquals("francês", sanduiche.pao);
        assertEquals("mussarela", sanduiche.queijo);
        assertEquals("peru", sanduiche.presunto);
        assertEquals("granja", sanduiche.ovo);
        assertEquals("sim", sanduiche.tomate);
    }

    @Test
    public void testSanduicheBola() {
        FactorySanduba factory = new BolaFactory();
        Sanduiche sanduiche = factory.criarSanduiche();

        assertEquals("bola", sanduiche.pao);
        assertEquals("cheddar", sanduiche.queijo);
        assertEquals("frango", sanduiche.presunto);
        assertEquals("granja", sanduiche.ovo);
        assertEquals("sim", sanduiche.tomate);
    }
}
