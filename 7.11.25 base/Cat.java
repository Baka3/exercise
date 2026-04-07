public class Cat extends Animal{
    private String furColour;
    @Override
    void getSpecies() {
        System.out.println("Cat");
    }
    public Cat(String name, int age, boolean isEndangered, String furColour) {
        super(name, age, isEndangered);
        this.furColour = furColour;
    }
    public String getFurColour() {
        return furColour;
    }
    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }
}
