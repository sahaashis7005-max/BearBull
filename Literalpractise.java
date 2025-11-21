
/**
 * Write a description of class Literalpractise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Literalpractise
{
    public static void main(String[] args) {

        // Long literal (requires 'L' suffix)
        long bigNumber = 9876543210L;

        // Float literal (requires 'f' suffix)
        float decimalValue = 12.34f;

        // Char literal using Unicode escape sequence (© symbol -> \u00A9)
        char copyrightSymbol = '\u00A9';

        // Printing the values
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + decimalValue);
        System.out.println("Unicode char value: " + copyrightSymbol);
    }
}