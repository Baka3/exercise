public abstract class Animal {
private String name;
private int age;
private boolean isEndangered = false;

abstract void getSpecies();

public Animal (String name, int age, boolean isEndangered) {
    this.name = name;
    this.age = age;
    this.isEndangered = isEndangered;
}
public void setEndangered(boolean isEndangered) {
    this.isEndangered = isEndangered;
}
public boolean getisEndangered() {
    return isEndangered;
}
public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public void setName(String name) {
    this.name = name;
}
public void setAge(int age) {
    this.age = age;
}
}