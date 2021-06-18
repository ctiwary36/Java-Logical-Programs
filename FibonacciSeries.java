package javaLogicalProgram;

public class FibonacciSeries {

    public static void main(String[] args) {

      int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("enter a number to find FibonacciSeries: ");
        int n = Utility.getUserSpecificInteger();
        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
