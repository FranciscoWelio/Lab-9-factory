import Ovo.Ovo;
import Pao.Pao;
import Presunto.Presunto;
import Queijo.Queijo;

public class FrancesMussarelaFrangoGranja extends Sanduiche{
    @Override
    public void montar() {
        System.out.println("Seu sanduiche FRANGO FRANCÊS está em produção!");
    }
    public FrancesMussarelaFrangoGranja(){
        this.pao = "Francês";
        this.queijo = "Mussarela";
        this.presunto = "Frango";
        this.ovo = "Granja";
    }
}
