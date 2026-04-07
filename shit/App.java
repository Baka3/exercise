public class App {
    public static void main(String[] args) {
        VerketteteListe<Double> liste1 = new VerketteteListe<>();
        liste1.einfVprne(3.5);
        liste1.einfVprne(4.7);

        liste1.getInhalt(0);
        liste1.getInhalt(1);
    }
}