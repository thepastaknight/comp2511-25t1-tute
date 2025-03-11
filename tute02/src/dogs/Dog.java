package dogs;

public abstract class Dog {
    private String color;

    public Dog(String color) {
        this.color = color;
    }

    public abstract void bark();

    public String getColor() {
        return color;
    }
}
