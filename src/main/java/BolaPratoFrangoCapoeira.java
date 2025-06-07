import Ovo.Ovo;
import Pao.Pao;
import Presunto.Presunto;
import Queijo.Queijo;

public class BolaPratoFrangoCapoeira extends Sanduiche{
    @Override
    public void montar() {
        System.out.println("Seu sanduiche FRANGO LUTADOR está em produção!");
    }
    public BolaPratoFrangoCapoeira(){
        this.pao = "Bola";
        this.queijo = "Prato";
        this.presunto = "Frango";
        this.ovo = "Capoeira";
    }
}
