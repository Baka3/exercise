import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Bestelleng {
    private final List<Produkt> produkte = new LinkedList<Produkt>();

    public Bestelleng() { }

    public void addProdukte(Produkt p) {
        produkte.add(p);
    }
    public double berechnesumme() {
    double summe = 0.0;
    for (Produkt p:produkte){ //для кожного продукту в списку (кожного р в produkte)
        summe+=p.getPreis();
    }
    return summe;
    }
}
