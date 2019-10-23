//Voinu Elena
package Voinu_Elena.hw3;

/**
 * Tests if Shapes are equal
 */
public class EqualsTest {
    public static void main(String[] args)
    {
        Shape s1;
        Shape s2;

        int testNum = 1;

        s1 = new Rectangle(5, 5);
        s2 = new Square(5);
        if(s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s2 = new Rectangle(5,5);
        if(! s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s2 = new Parallelogram(5, 5);
        if(s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s2 = new Rectangle(4, 4);
        if(s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s1 = new Square(3);
        s2 = new Square(2);
        if(s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s2 = new Square(3);
        if(! s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s1 = new Parallelogram(5, 3);
        s2 = s1;
        if(! s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s1 = new Circle(5);
        s2 = new Circle(3);
        if(s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s2 = s1;
        if(! s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

        s1 = new Circle(4);
        s2 = new Circle(4);
        if(! s1.equals(s2))
            System.out.println("FAIL: Test " + testNum++);
        else
            System.out.println("PASS: Test" + testNum++);

    }
}
