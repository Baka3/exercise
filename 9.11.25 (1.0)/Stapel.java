public class Stapel<T> {
Knoten<T> kopf;
Knoten<T> letzte;
public Stapel(){
}
    public boolean isEmpty() {
        return kopf == null;
    }    

    public int anzahlElemente(){
        int anzahl = 0;
        Knoten<T> current = kopf;
        if(current==null){
            return anzahl;
        }
        else{
            while(current != null){ //
                current = current.getNaechster();
                anzahl++;
            }
        }
        return anzahl;
    }
    public void push(T inhalt){ //запам'ятай, що в дужках Додає новий елемент в ГОЛОВУ
        Knoten<T> newKnoten = new Knoten<T>(inhalt); //що в дужках
        //Knoten<T> current = kopf;
        if(isEmpty()){
            kopf = newKnoten; // ми не можемо написати kopf.setInhalt(newKnoten),бо kopf, це НЕ КВАДРАТИК мине можемо помістити значення в неіснуючий об'єкт
            //kopf.setNaechster(null);
        }
        else{
            //Knoten<T> currnt = kopf;
            //currnt.setNaechster(kopf);
            //currnt.setInhalt(newKnoten);
            newKnoten.setNaechster(kopf);
            kopf = newKnoten;
            }
        }
        
    public T pop(){
        if (!isEmpty()){
        //throw new RuntimeException("Stapel ist leer");
        }   
        
        T dataToReturn = kopf.getInhalt();
        kopf = kopf.getNaechster();
        return dataToReturn;
        
    } 
    public T top(){
        if(isEmpty()){
            return null;
        }
        else{
            //Knoten<T> current = kopf;
            return kopf.getInhalt();
        }
    }
    public void gibAlles(){
        if(isEmpty()){
            System.out.println("Leer");
        }
        else{
            Knoten<T> current = kopf;
            while (current != null) {
                System.out.println(current);
                current = current.getNaechster();
            }
            System.out.println(current);
        }
    }
    /*public T reverse(){
        if (isEmpty()){
            return null;
        }
        else{
            Knoten<T> current = kopf;
            while(current.getNaechster() != null){
                current = current.getNaechster();
            }
            letzte = current;
            //letzte.getInhalt();
            while (current.getPrevious() != null) {
                current = current.getPrevious();
                current.getInhalt();
            }
            return current.getInhalt();
        }
    }*/
    
}