
public class App {
    public static void main(String[] args) {
        Stapel<Integer> stapel1 = new Stapel<>();
        Stapel<String> stapel2 = new Stapel<>();
        Stapel<Double> stapel3 = new Stapel<>();

        stapel1.push(5);
        stapel1.push(56);
        stapel1.push(47);
        stapel1.push(36);

        stapel2.push("A");
        stapel2.push("B");
        stapel2.push("C");
        stapel2.push("D");
        stapel3.push(58.6);

        System.out.println("stapel1 anzahl: " + stapel1.anzahlElemente());
        stapel1.pop();
        System.out.println(stapel1.top()); 
        //stapel1.pop();
        System.out.println("stapel1 anzahl: " + stapel1.anzahlElemente());

        //System.out.println(stapel2.reverse());
        System.out.println("Alles" + stapel1.gibAlles());

    }
}
