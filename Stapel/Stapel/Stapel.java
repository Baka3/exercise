public class Stapel <T> { 
    
    private Knoten<T> kopf;

    public Stapel() {
    }

    public boolean isEmpty() {
        return kopf == null;
    }

    public int anzahlElemente() {
        int anzahl = 0;
        Knoten<T> current = kopf;
        while (current != null) {
            anzahl++;
            current = current.getNaechster();
        }
        return anzahl;
    }
    public void push(T plnhalt){
        Knoten<T> neuerKnoten = new Knoten<>(plnhalt);
        if (kopf == null) {
            kopf = neuerKnoten;
        } else {
            Knoten<T> current = kopf;
            while (current.getNaechster() != null) {
                current = current.getNaechster();
            }
            current.setNaechster(neuerKnoten);
        }
    }
    public void pop() {
        if (!isEmpty() && kopf.getNaechster() != null) { //як він можн бути порожнім і попри це мати наступний елемент?
            Knoten<T> current = kopf;
            while (current.getNaechster().getNaechster() != null) {
                current = current.getNaechster();
            }
            current.setNaechster(null);
        } else if (!isEmpty()) {
            kopf = null;
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        
        Knoten<T> current = kopf;
        while (current.getNaechster() != null) {
            current = current.getNaechster();
        }
        return current.getInhalt();
    }
}
