package chapter5;

public class Primate {

    public boolean hasHair() {
        return true;
    }
}


interface HasTail {
    public boolean isTailStriped();
}


class Lemur extends Primate implements HasTail {

    public int age;

    public boolean isTailStriped() {
        return false;
    }

    public boolean hasHair() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        System.out.println(lemur.hasHair());
    }

}

