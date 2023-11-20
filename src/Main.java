public class Main {
    public static void main(String[] args) {
        int inputNumber = 15;
        FibonacciFinder fibonacciFinder = new FibonacciFinder();
        System.out.println("Fibonacci :" +fibonacciFinder.fibonacci(inputNumber));
    }
}
class FibonacciFinder{
    int fibonacci(int number){
        if(number<=1){
            return number;
        }
        return fibonacci(number-1)+(number-2);
    }
}