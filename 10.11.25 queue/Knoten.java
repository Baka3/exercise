public class Knoten <T>{
public Knoten<T> naechster;
public T inhalt;

public Knoten (T inhalt, Knoten<T> naechster){
    this.naechster = null;
    this.inhalt = inhalt;
}
    public T getInhalt() {
        return inhalt;
    }
    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }
    public Knoten<T> getNaechster() {
        return naechster;
    }
    public void setNaechster(Knoten<T> naechster) {
        this.naechster = naechster;
    }
}