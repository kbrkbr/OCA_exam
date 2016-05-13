package chapter3;

public class OcaStrings {

    public static void main(String args[]) {

	// concat strings and integer by + sign
	System.out.println(1 + 2 / 3 + "a" + "b");

	String s = "1";
	s += "3";
	s += 2;
	System.out.println(s);

	// important string functions
	System.out.println(s.length());

	// use charAt() to get special character
	System.out.println(s.charAt(2));

	// use indexOf() to find first occurance of character / string
	System.out.println(s.indexOf('3'));
	System.out.println(s.indexOf("2"));

	s = "Hello there my friend";

	// substring
	System.out.println(s.substring(2));
	System.out.println(s.substring(s.indexOf("my")));

	// toLowerString
	System.out.println(s.toUpperCase());

	// equals and equalsIgnoreCase()
	System.out.println(s.equals("nblun"));

	// startsWith(), endsWith(), contains()

	// replace(), trim()
	System.out.println("hello there".replace("there", "you"));
	System.out.println("hello there".replace("h", "je taime"));

	// StringBuilder - Mutable
	StringBuilder sb = new StringBuilder("nice one");
	sb.append(" and another one");
	System.out.println(sb);

	// stringbuilder function return reference
	// insert(index, varible)
	// delete(startindex, endindex)
	// reverse()
	// toString()

	// StringBuilder is newer Version of StringBuffer

	// Equality
	// Strings are immutable, Literals are pooled
	// "Hello World" != " Hello World".trim()
	// new String("1") != "1"

	// -> use .equals()!

    }
}