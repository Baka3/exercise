public class App {
    public static void main(String[] args) {
        Queue<Double> queue1 = new Queue<>();
        queue1.enqueue(3.7);
        queue1.enqueue(7.9);
        queue1.enqueue(8.95);
        queue1.enqueue(4.7);
        System.out.println(queue1.anzahlElemente());
        queue1.dequeue();
        System.out.println(queue1.anzahlElemente());
        System.out.println(queue1.indexInhalt(2));
        queue1.gibAlles();
    }
}
