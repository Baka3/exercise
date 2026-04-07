import java.util.Queue;
import java.util.LinkedList;

public class OrderProcessor {
    public static void main(String[] args) {
    //Queue<Order>
    Queue<Order> orders = new LinkedList<>();

    Order order1 = new Order(1, "Computer");
    Order order2 = new Order(2, "Plush");
    Order order3 = new Order(3, "Smartphone");
    Order order4 = new Order(4, "Sushi");

    orders.add(order1);
    orders.add(order2);
    orders.add(order3);
    orders.add(order4);
    System.out.println(orders.toString());

    while (!orders.isEmpty()){
        Order order = orders.poll(); //remove()
        System.out.println(order.toString() + " order has been processed ");
    }

    }

}
