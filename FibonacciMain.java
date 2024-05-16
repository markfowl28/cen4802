public class FibonacciMain {
    public static void main(String[] args){
        int term, num;

        num = 10;
        term = FindTerm(num);

        System.out.println("The " + num + "th term of the Fibonacci Sequence is: " + term);
    }
    static int FindTerm(int num){
        if (num <= 1)
            return num;

        return FindTerm(num - 1) + FindTerm(num - 2);
    }
}
