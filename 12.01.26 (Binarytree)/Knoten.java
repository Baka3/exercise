public class Knoten<T> {
    private T inhalt;
    private Knoten<T> linke;
    private Knoten<T> rechte;

    public Knoten(T pInhalt){
        this.inhalt = pInhalt;
        this.linke = null;
        this.rechte = null;
    }
    public boolean istBlatt(){
        if (getLinke() == null && getRechte() == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void ausgebenDatenInorder(){
        if(getLinke()!=null){
            getLinke().ausgebenDatenInorder();
        }
        System.out.println(getInhalt());
        if(getRechte()!=null){
            getRechte().ausgebenDatenInorder();
        }
    }
    public void ausgebenDatenPreorder(){
        System.out.println(getInhalt());
        if(getLinke()!=null){
            getLinke().ausgebenDatenPreorder();
        }
        if(getRechte()!=null){
            getRechte().ausgebenDatenPreorder();
        }
    }
    public void ausgebenDatenPostorder(){
        System.out.println(getInhalt());
        if(getLinke()!=null){
            getLinke().ausgebenDatenPostorder();
        }
        if(getRechte()!=null){
            getRechte().ausgebenDatenPostorder();
        }
    }

    public void setRechte(Knoten<T> rechte) {
        this.rechte = rechte;
    }
    public Knoten<T> getRechte() {
        return rechte;
    }
    public void setLinke(Knoten<T> linke) {
        this.linke = linke;
    }
    public Knoten<T> getLinke() {
        return linke;
    }
    public void setInhalt(T pInhalt){
        this.inhalt = pInhalt;
    }
    public T getInhalt(){
        return inhalt;
    }
}
