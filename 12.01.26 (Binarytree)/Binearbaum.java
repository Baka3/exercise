public class Binearbaum <T>{

    private Knoten<T> wurzel;
    
    public Binearbaum (Knoten<T> pWurzel){
        this.wurzel = pWurzel;
    }
    public Binearbaum (){ };

    public int anzahlKnoten(Knoten<Integer> pWurzel){
        if(!istLeer()){
            return  anzahlKnoten(pWurzel.getLinke()) + anzahlKnoten(pWurzel.getRechte());
        }
        else{
            return 0;
        }
    }
    public int anzahlBlaetter(Knoten<T> pWurzel){
        if(istLeer()){
            return 0;
        }
        else if(pWurzel.istBlatt()){
            return +1;
        }
        else{
            return anzahlBlaetter(pWurzel.getLinke()) + anzahlBlaetter(pWurzel.getRechte());
        }
    }

    public int hoehe(Knoten<Integer> pWurzel){
        if(wurzel!=null){
            return +1 + Math.max(hoehe(pWurzel.getLinke()), hoehe(pWurzel.getRechte()));
        }
        else{
            return 0;
        }
    }
    public int tiefe(Knoten<Integer> pWurzel){
        if(wurzel!= null){
            return tiefe(pWurzel.getWurzel())
        }
        else{
            return 0;
        }
    }

    public void ausgebenDatenInorder(){
        if(!istLeer()){
            wurzel.ausgebenDatenInorder();
        }  
    }
    public void ausgebenDatenPreorder(){
        if(!istLeer()){
            wurzel.ausgebenDatenPreorder();
        }
    }
    public void ausgebenDatenPostorder(){
        if (!istLeer()) {
            wurzel.ausgebenDatenPostorder();
        }
    }
    public boolean istLeer(){
        if (wurzel == null){
            return true;
        }
        else{
            return false;
        }
    }
    public Knoten<T> getWurzel() {
        return wurzel;
    }
    public void setWurzel(Knoten<T> wurzel) {
        this.wurzel = wurzel;
    }
}