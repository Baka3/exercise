public class VerketteteListe <T>{
private Knoten<T> kopf;

public void einfVprne(T pInhalt){
    Knoten<T> newKnot = new Knoten<>(pInhalt);
if(kopf==null){
    kopf = newKnot;
}
else{
    Knoten<T> current = kopf;
    while (current!= null) {
        current = newKnot;
        //current = kopf;
    }
    //current.getNaechster();
    kopf = current.getNaechster();
}
}

   public T getInhalt(int var1) {
      if (this.kopf == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1 && this.kopf != null; ++var2) {
            this.kopf = this.kopf.getNaechster();
         }

         return this.kopf.getInhalt();
      }
   }

}