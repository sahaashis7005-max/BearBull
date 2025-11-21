
/**
 * Write a description of class Datatypeinspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Datatypeinspector
{
    public static void main(String[] args) {

        // Declaring and initializing all 8 primitive data types
        byte byteValue = 25;               // 1 byte
        short shortValue = 32000;          // 2 bytes
        int intValue = 100000;             // 4 bytes
        long longValue = 5000000000L;      // 8 bytes (note the 'L')
        
        float floatValue = 3.14f;          // 4 bytes (note the 'f')
        double doubleValue = 99.999;       // 8 bytes
        
        char charValue = 'A';              // 2 bytes (single character)
        boolean booleanValue = true;       // 1 bit (logical value)

        // Printing values with descriptive labels
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}