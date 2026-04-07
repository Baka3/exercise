public class App {
    public static void main(String[] args) {
        VerketteteListe<String> liste1 = new VerketteteListe<>();
        liste1.anhaengen("Hallo");
        liste1.anhaengen("Welt");
        liste1.anhaengen("100110");
        System.out.println("Anzahl der Elemente in liste1: " + liste1.anzahlElemennte());
        //System.out.println("Inhalt an Index 2: " + liste.gibInhalt(2));

        VerketteteListe<Integer> liste2 = new VerketteteListe<>();
        liste2.anhaengen(5);
        liste2.anhaengen(10);
        liste2.anhaengen(15);
        liste2.anhaengen(48);
        System.out.println("Anzahl der Elemente in liste2: " + liste2.anzahlElemennte());
        System.out.println("Inhalt an Index 1 in liste2: " + liste2.gibInhalt(1));
        liste2.einfuegenVorne(10);
        liste2.einfuegenVorne(20);
        liste2.einfuegenVorne(30);
        liste2.einfuegenVorne(40);

        liste2.einfuegen(42, 3);
        liste2.einfuegen(21, 4);
        liste2.einfuegenVorne(82);
        liste2.anzahlElemennte();
        liste2.entfernen(5);
        liste2.entfernenVorne();
        liste2.anzahlElemennte(); 

        VerketteteListe<Integer> liste3 = new VerketteteListe<>();
        liste3.anhaengen(33);
        liste3.anhaengen(5);
        liste3.anhaengen(27);
        liste3.anhaengen(19);
        liste3.anhaengen(99);
        liste3.anhaengen(29);
        liste3.anhaengen(85);
        
        System.out.println("Elemente in der liste3: " +
        liste3.gibInhalt(0) + " " +
        liste3.gibInhalt(1) + " " +
        liste3.gibInhalt(2) + " " +
        liste3.gibInhalt(3) + " " +
        liste3.gibInhalt(4) + " " +
        liste3.gibInhalt(5) + " " +
        liste3.gibInhalt(6));
        //liste3.ElementeAnzeigen();

        VerketteteListe<Integer> liste4 = liste3;
        liste4.sortieren();
        //System.out.println("Anzahl der Elemente sortierte liste3: " + liste4.anzahlElemennte());
        //liste4.ElementeAnzeigen();
        System.out.println("Sortierte Elemente in der liste3: " +
        liste4.gibInhalt(0) + " " +
        liste4.gibInhalt(1) + " " +
        liste4.gibInhalt(2) + " " +
        liste4.gibInhalt(3) + " " +
        liste4.gibInhalt(4) + " " +
        liste4.gibInhalt(5) + " " +
        liste4.gibInhalt(6));
    }
}
