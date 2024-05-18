/**
 * FibonacciMain is the main entity that we'll be using to find the nth term of the Fibonacci Sequence.
 * @author markf
 * @version     %I%, %G%
 * @since       1.0
 */
public class FibonacciMain {
    public static void main(String[] args){
        int term, num;

        num = 10;
        term = FindTerm(num);

        System.out.println("The " + num + "th term of the Fibonacci Sequence is: " + term);
    }

    /**
     * <p>
     *     Uses the first if statement to check if the 0th or 1st term is being calculated and returns itself
     *     Otherwise, uses a recursive statement to calculate and return the number at the nth term provided
     * </p>
     * @param num the nth term in the fibonacci sequence
     * @return the calculated number for the nth term in the fibonacci sequence
     */
    static int FindTerm(int num){
        if (num <= 1)
            return num;

        return FindTerm(num - 1) + FindTerm(num - 2);
    }
}
