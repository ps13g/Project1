public class Swap {
    public static void main(String args[]) {

        int numA = 4, numB = 9;
        System.out.println("First number: " + numA + "\nSecond number: " + numB);

        int before = numA;
        numA = numB;
        numB = before;

        System.out.println("First number: " + numA + "\nSecond number: " + numB);

    }
}
