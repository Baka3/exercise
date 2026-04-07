public class Knoten <T>{
    private T inhalt; //data
    private Knoten<T> naechster; 

    public Knoten(T plnhalt){
        this.inhalt=plnhalt;
        this.naechster=null;
    }
    public void setInhalt(T pInhalt){
        this.inhalt = pInhalt;
    }
    public T getInhalt(){
        return inhalt;
    }
    public Knoten<T> getNaechster(){
        return naechster;
    }
    public void setNaechster(Knoten<T> pInhalt){
        this.naechster=pInhalt;
    }
}
