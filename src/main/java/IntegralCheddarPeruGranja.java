import Ovo.Ovo;
import Pao.Pao;
import Presunto.Presunto;
import Queijo.Queijo;

public class IntegralCheddarPeruGranja extends Sanduiche{
    @Override
    public void montar() {
        System.out.println("Seu sanduiche INTEGRAL DO CAMPO está em produção!");
    }
    public IntegralCheddarPeruGranja(){
        this.pao = "Integral";
        this.queijo = "Cheddar";
        this.presunto = "Peru";
        this.ovo = "Granja";
    }
}
