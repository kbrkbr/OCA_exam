package chapter5;

public class ClassInheritance {

    // inheritance
    // mark class as final - no inheritance possible
    // public abstract/final class ClassName extends ParentClass

    // override non-private members
    // same signature
    // at least as accessible as parent member
    // don't throw a new or broader exception
    // return type must be same or sublass as parent

    // override static member:
    // same as override non-private members
    // if (not) static in parent, also (not) static in child

    // difference between hiding and overriding
    // overriding : at runtime only most specified override is known, replaces call
    // hiding : version of the function in the current class is called

    // final - no override or hide

    // variable inheritance
    // only hiding
    // define variable with same name
    // if referencing in parent class, this instance is uses

    // abstract classes and methods
    // class must be abstract to contain abstract methods

    // interfaces
    // variables : public static final, val must be set
    //  default interface methods
    //      if marked with default, must have body
    //  static interface methods
    //      not inherited


    // on extends and implements
    // class can extend 1 other class and implement N interfaces
    // interfaces can only extend other interfaces

    // casting objects
    // always depends ob object, that is referenced
    // subclass - superclass : no cast
    // superclass - subclass : explicit cast

    // polymorphic parameters
    // method parameter is superclass, specialisation of that class is passed

    public static void main(String[] args) {
        System.out.println("Hi there");
        Lion lion = new Lion(3);
        lion.roar();
        TestStatic.testThis();
    }
}

interface TestStatic {
    static void testThis() {
        System.out.println("oh hi");
    }
}

class rodent {
    protected static Integer chew() throws Exception {
        return 0;
    }
}

class Beaver extends rodent {
    public static Integer chew() throws RuntimeException {
        return 0;
    }
}






