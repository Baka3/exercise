    public class App {
    public static void main(String[] args) {
        Stapel<String> stapel1 = new Stapel<>();
        stapel1.push("Hallo");
        stapel1.push("Welt");
        stapel1.push("100110");
        System.out.println("Anzahl der Elemente in stapel1: " + stapel1.anzahlElemente());

        Stapel<Integer> stapel2 = new Stapel<>();
        stapel2.push(5);
        stapel2.push(10);
        stapel2.push(15);
        stapel2.push(48);
        System.out.println("Anzahl der Elemente in stapel2: " + stapel2.anzahlElemente());
        stapel2.pop();
        System.out.println("Oberster Wert in stapel2: " + stapel2.top());
    }
}
