import java.util.Scanner;
public class ShelterServise {
    private boolean isAdult= false;
    private String [] avaliableAnimals = {"Dog", "Cat"};
    Scanner sc = new Scanner(System.in);

    public void isAdult(Person person, Animal animal) {
        if (person.getAge()>=18) {
        isAdult = true;
        System.out.println(person.getName() + " can adopt an animal ");
        person.chooseAnimal(null);
    }
    else{
        isAdult = false;
        System.out.println(person.getName() + " Can't adopt an animal");
        }
    }
    if isAdult == true {
        chooseAnimal(null);
    }
    public void chooseAnimal(Person adopter){
        Animal animaltype = null;
        System.out.println("Hello " + adopter.getName() + "Wich animal would you like to adopt? " + getAvaliableAnimals());
        System.out.println("Enter 1 for Dog or 2 for Cat:");
        int choice = sc.nextInt();
        if (choice == 1){
            animaltype = new Cat(null, choice, null, isAdult, null);
        }
        else if (choice ==2){
            animaltype = new Dog ;
        }
        else{
            System.out.println("Invalid choice. Please try again.");
        }
        if (animaltype != null) {
            confirmAdoption(adopter, animaltype);
        }
    }
    private void confirmAdoption(Person adopter, Animal animal) {
        System.out.println("----------------------------------------");
        System.out.println(adopter.getName() + " успішно всиновив(-ла) " + animal.getSpecies() + " на ім'я " + animal.getName() + "!");

    public boolean getIsAdult() {
        return isAdult;
    }
    public String[] getAvaliableAnimals() {
        for (String animal: avaliableAnimals){
            System.out.println(animal);
        }
        return avaliableAnimals;
    }

}

//System.out.println("Wich animal would you like to adopt?");
         //а як зробити так, щоб користувай міг сам обирати, тварину якого типу він хоче взяти?