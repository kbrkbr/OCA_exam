package chapter4;

public class OcaMethodsAndEncapsulation {

    public static void main(String[] args) {
	
	System.out.println("Hio there");
	
	// access specifiers
	// public - any
	// private - only class itself
	// protected - only class and descendants and classes in same package
	
	// method names
	// letters, numbers, $, _ first letter cannot be a number
	
	// exceptions
	// optional, multiple exceptions seperated by comma
	
	// static imports
	// import static java.util.Arrays.asList;
	// import static java.util.Arrays.*;
	
	// all parameters passed by reference
	
	// overloading
	// at least change parameter list
	// varargs == array
	// order: exact match, wider types, autoboxed type, varargs
	// conversion: only in one step, putting int into Long wont work
	
	//constructors
	// call different constructor in constructor: this(bla, blub);
	
	// !
	// oder of initialization
	// 1. superclass initialization
	// 2. static var init and static initializers
	// 3. instance var decl and instance initializers
	// 4. Constructor
	// !
	
	// immutable classes
	// get and set a copy to get true immutability
	
	// lambdas
	// () -> true;
	// a -> a.startsWith("a");
	// (a, b) -> a.startsWith(b);
	// (String a, String b)-> a.startsWith(b);
	// (String a)-> a.startsWith("b");
	// (a) -> {return true;}
	
	// predicates
	// public Interface Predicate<T> {
	// 	boolean test(T t);
	// }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }

}











