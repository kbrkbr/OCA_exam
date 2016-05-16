package chapter4;

import java.util.ArrayList;
import java.util.List;

public class LambdaStuff {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("dog", true, true));
        animals.add(new Animal("karpador", false, false));

        print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());

    }

    public static void print(List<Animal> animals, CheckTrait hopChecker) {

        for (Animal animal : animals) {
            System.out.println(String.format("%-8s %s %s",
                    animal, " can hop?", hopChecker.test(animal)));
        }

    }

}


class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    public boolean canHop() {
        return this.canHop;
    }

    public boolean canSwim() {
        return this.canSwim;
    }

    public String toString() {
        return this.species;
    }

}


interface CheckTrait {

    public boolean test(Animal a);

}


class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }

}
