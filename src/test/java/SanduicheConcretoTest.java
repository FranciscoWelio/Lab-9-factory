import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanduicheConcretoTest {
    @Test
    void deveCriarSanduicheComTodosIngredientes() {
        // Arrange
        Pao pao = new Pao("Integral");
        Queijo queijo = new Queijo("Prato");
        Presunto presunto = new Presunto("Frango");
        Ovo ovo = new Ovo("Capoeira");
        Tomate tomate = new Tomate();

        // Act
        SanduicheConcreto sanduiche = new SanduicheConcreto(pao, tomate, queijo, presunto, ovo);

        // Assert
        assertNotNull(sanduiche, "O sanduíche não deveria ser null");
    }
}