public abstract class Sanduiche {
    protected String pao = "Forma";
    protected String queijo = "Gorgonzola";
    protected String presunto = "Peito de Peru";
    protected String ovo = "Codorna";
    protected String tomate = "Tomate";

    public abstract void montar();

    @Override
    public String toString(){
        return "Sanduiche com: " + "\n" + "Pão: "+
                pao + "\n" + "Queijo: " +
                queijo + "\n" + "Presunto: " +
                presunto + "\n" + "Ovo: "+
                ovo + "\n" + "E" +
                tomate;
    }
}
