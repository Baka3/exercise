public class Queue <T extends Comparable <T>>{
    Knoten<T> kopf = null;

    public boolean isEmpty(){
        if(kopf==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int anzahlElemente(){
        int anzhl = 0;
        if (isEmpty()){
            return 0;
        }
        else{
            Knoten<T> current = kopf;
            while (current!=null) {
                current=current.getNaechster();
                anzhl++;
            }
            return anzhl;
        }
        
    }
    public void enqueue(T inhalt){
        Knoten<T> newKnot = new Knoten<>(inhalt,null); // СПОЧАТКУ СТВОРЮЄШ НОВИЙ ОБ'ЄКТ!!!
         
        if (isEmpty()){
            kopf = newKnot; //!!!
        }
        else{
            Knoten<T> current = kopf;
            while (current.getNaechster() != null) {
                current = current.getNaechster();
            }
            current.setNaechster(newKnot); //!!!!!
        }
    }
    public void dequeue(){
        if(isEmpty()){

        }
        else{
            kopf = kopf.getNaechster();
        }
    }
    public T indexInhalt(int index){
        
        Knoten<T> current = kopf;
        for(int i = 2; i < index; i++ ){ 
            if (isEmpty()){
            return null;
            }
            current = current.getNaechster();
        }
        return current.getInhalt();
    }

    /*public void gibAlles(){
    if(kopf == null){
        System.out.println("Список порожній.");
    }
    else{
        Knoten<T> current = kopf;
        System.out.print("Елементи: ");
        while (current != null) {
            System.out.print(current.getInhalt() + " "); // *** ДОДАНО ДРУК ***
            current = current.getNaechster();
        }
        System.out.println(); // Для переходу на новий рядок
    }
}*/
    public void gibAlles(){ // не видає останне число, бо виходимо з лупу перед тим
        if(kopf == null){

        }
        else{
            Knoten<T> current = kopf;
            //System.out.println(current.getInhalt());
            while (current != null) {
                System.out.println(current.getInhalt() + " ");
                current = current.getNaechster();
               //System.out.println(current.getInhalt());
            }
            //System.out.println(current.getInhalt());
        }
    }
    public void sortieren(){
        if(isEmpty()){
            
        }
        else{
            Knoten<T> current = kopf;
            T a = current.getInhalt();
            T b = current.getNaechster().getInhalt();
            for(int i = 0; i < anzahlElemente(); i++){
                for(int j = 0; j<i; j++){
                    if(a.compareTo(b) > 0){
                        //T temp b;
                        a.setInhalt(b);
                        b.setInhalt(a);
                        
                    }
                }
            }
        }
    }
}
