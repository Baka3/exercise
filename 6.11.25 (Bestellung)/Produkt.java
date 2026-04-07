public class Produkt {
    private String name;
    private double preis;
    private int ID;

    public Produkt (String name, double preis, int ID){
        this.name = name;
        this.preis = preis;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public double getPreis(){
        return preis;
    }
    public void setPreis (double preis){
        this.preis = preis;
    }
    public int getID(){
        return ID;
    }
    public void setID (int ID){
        this.ID = ID;
    }
}
