
/**
 * Write a description of class Defaultvaluechecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// File: DefaultValues.java
public class DefaultValues {
    // Instance fields (member variables) declared without initialization
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        // Creating an object to access instance fields (default values are assigned by JVM)
        DefaultValues obj = new DefaultValues();

        System.out.println("Default byte: " + obj.b);
        System.out.println("Default short: " + obj.s);
        System.out.println("Default int: " + obj.i);
        System.out.println("Default long: " + obj.l);
        System.out.println("Default float: " + obj.f);
        System.out.println("Default double: " + obj.d);
        System.out.println("Default char: '" + obj.c + "'"); // prints '\u0000' (looks empty)
        System.out.println("Default boolean: " + obj.bool);

        /*
         NOTE:
         - These are instance (member) variables so the JVM automatically gives them default values:
           numeric types -> 0 (or 0.0), char -> '\u0000', boolean -> false
         - Local variables (inside methods) do NOT get default values; you must initialize them
           before use or the code will not compile.
        */
    }
}

    