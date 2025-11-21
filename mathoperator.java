
/**
 * Write a description of class mathoperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperator
{
    public static void main(String[] args) {
        
        System.out.println("=== 1. Arithmetic Operators ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        
        System.out.println("\n=== 2. Unary Operators ===");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("After x++, x = " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("After ++x, x = " + x);
        
        System.out.println("\n=== 3. Assignment Operators ===");
        int num = 20;
        System.out.println("num = " + num);
        num += 5;
        System.out.println("num += 5 → " + num);
        num -= 3;
        System.out.println("num -= 3 → " + num);
        num *= 2;
        System.out.println("num *= 2 → " + num);
        num /= 4;
        System.out.println("num /= 4 → " + num);

        System.out.println("\n=== 4. Relational Operators ===");
    }
}

        
       
        


        
