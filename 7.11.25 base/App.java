public class App {
    public static void main(String[] args) {
        ShelterServise manager = new ShelterServise();
        Person anya = new Person  ("Anya", 18);
        manager.chooseAnimal(anya);
        Person john = new Person  ("John", 15);
        manager.chooseAnimal(john);

        
        /*Cat booboo = new Cat ("Booboo", 2, false, "Brown");
        manager.isAdult(anya,booboo);
        if (manager.getIsAdult() == false) {
            //System.out.println("Adoption not allowed");
        }
        else {
            System.out.println(anya.getName() + " owns a cat named " + booboo.getName());
        }
        
        Person bob = new Person ("Bob", 16);
        Dog spake = new Dog ("Spake", 3, false, "English Bulldog");
        manager.isAdult(bob, spake);
        if (manager.getIsAdult() == true) {
            System.out.println(bob.getName() + " owns a dog named " + spake.getName());
        }
        else {
            //System.out.println("Adoption not allowed");
        }*/
    }
}
