public class Order {
    private int orderId;
    private String productName;

    public Order(int orderId, String productName){
        this.orderId = orderId;
        this.productName = productName;
    }
    public String toString(){
        return "ID: " + orderId + " produkt: " + productName;
    }
    public int getOrderId(){
        return orderId;
    }
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
}
