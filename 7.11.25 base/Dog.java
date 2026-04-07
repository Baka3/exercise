public class Dog extends Animal{
    private String breed;

    @Override
    void getSpecies() {
        System.out.println("Dog");
    }

    public Dog(String name, int age, boolean isEndangered, String breed) {
        super(name, age, isEndangered);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
