public class Knoten<T> {
    private T inhalt;
    private Knoten<T> naechster;
    private Knoten<T> previous;

    public Knoten (T inhalt /*Knoten<T> naechster*/){
        this.inhalt = inhalt;
        this.naechster = null;
    }

    public T getInhalt() {
        return inhalt;
    }
    public void setInhalt(T inhalt){
        this.inhalt = inhalt;
    }
    public Knoten <T> getNaechster(){
        return naechster;
    }
    public void setNaechster(Knoten<T> naechster){
        this.naechster = naechster;
    }
    public void setPrevious(Knoten<T> previous){
        this.previous = previous;
    }
    public Knoten<T> getPrevious() {
        return previous;
    }
}
