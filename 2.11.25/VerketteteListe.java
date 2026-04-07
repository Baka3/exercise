public class VerketteteListe <T extends Comparable<T>> { 
    
    private Knoten<T> kopf;

    public VerketteteListe() {
    }
    public int anzahlElemennte(){
        int anzahlElemennte = 0;
        Knoten<T> current = kopf;
        while (current != null){
            anzahlElemennte++;
            current = current.getNaechster();
        }
        return anzahlElemennte;
    }
    public void anhaengen(T plnhalt){
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
    public T gibInhalt(int index) {
        if (kopf == null) {
            return null;
        } else {
            Knoten<T> current = kopf;
            for (int i = 0; i < index; i++) {
            if (current == null) 
            return null;
            else{
            current = current.getNaechster();
            }         
        }
        return current.getInhalt();
        }
    }
    public void einfuegenVorne(T pInhalt){
        Knoten<T> current = kopf;
        Knoten<T> neuerKnoten = new Knoten<>(pInhalt);
        neuerKnoten.setNaechster(current);
        current = neuerKnoten;
    }
    public void einfuegen (T pInhalt, int index){
        Knoten<T> neuerKnoten = new Knoten (pInhalt);
        if (index == 0) {
            einfuegenVorne(pInhalt);
            return;
        }
        Knoten<T> current = kopf;
        for (int i = 0; i < index - 1 && kopf != null; i++) {
            current = current.getNaechster();
        }
        if (current != null) {
            neuerKnoten.setNaechster(current.getNaechster());
            current.setNaechster(neuerKnoten);
    }
    }
    public void entfernen (int index){
        if (index == 0) {
            entfernenVorne();
            return;
        }
        Knoten<T> current = kopf;
        for (int i = 0; i < index - 1 && kopf != null; i++) {
            current = current.getNaechster();
        }
        if (current != null && current.getNaechster() != null) {
            current.setNaechster(current./*getNaechster().*/getNaechster());
        }
        
    }
    public void entfernenVorne(){
        if (kopf != null) {
            kopf = kopf.getNaechster();
        }

    }
    public void sortieren(){
        if (kopf == null || kopf.getNaechster() == null) {
            return;
        }
        
        for (int i = 0; i < anzahlElemennte(); i++) {
            Knoten<T> current = kopf;
            while (current.getNaechster() != null) {
                T a = current.getInhalt();
                T b = current.getNaechster().getInhalt();
                
                if (a.compareTo(b) > 0) {
                    current.setInhalt(b);
                    current.getNaechster().setInhalt(a);
                }
                current = current.getNaechster();
            }
        }
    }
    /*public void ElementeAnzeigen(){
        Knoten<T> current = kopf;
        T currentInhalt = current.getInhalt();
        System.out.println("Elemente in der Liste:");
        while (current != null){
            System.out.println(currentInhalt);
            if (current.getNaechster() != null){
                current = current.getNaechster();
                currentInhalt = current.getInhalt();
            }
        }
    } */
}