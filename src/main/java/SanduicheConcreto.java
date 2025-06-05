public class SanduicheConcreto implements Sanduiche{
    private Pao pao;
    private Ovo ovo;
    private Queijo queijo;
    private Presunto presunto;
    private Tomate tomate;

    public SanduicheConcreto(Pao pao, Tomate tomate, Queijo queijo, Presunto presunto, Ovo ovo) {
        this.pao = pao;
        this.tomate = tomate;
        this.queijo = queijo;
        this.presunto = presunto;
        this.ovo = ovo;
    }

    @Override
    public void descrever() {
        System.out.println("Sanduiche com: " +"\n"+
                " -2 fatias de Pão: " + pao + "\n"+
                " -1 fatia de Queijo: "+ queijo+"\n"+
                " -1 fatia de presunto: "+presunto+"\n"+
                " -1 ovo: " + ovo+"\n"+
                " - Tomate");
    }
}
