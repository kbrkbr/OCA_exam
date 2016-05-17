package chapter5;

public class Lion extends Animal {

    public Lion(int age) {
        super(age, "Lion");
    }

    public Lion() {
        this(4);
    }

    public void roar() {
        System.out.println("The " + getAge() + " old lion named " + getName() + " says ROAR");
    }
}
