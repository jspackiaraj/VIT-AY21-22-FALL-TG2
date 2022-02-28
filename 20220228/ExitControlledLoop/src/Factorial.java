public class Factorial {
    public static void main(String[] args) {
        int intFactorialToBeFoundFor;
        intFactorialToBeFoundFor =5;
        // 0! = 1; 1! = 1; 5! = 120
        //Program Variable declaration and initialization
        int factorial;
        factorial = 1;
        int cntI;
        cntI = 1;
        if (intFactorialToBeFoundFor == 0){
            factorial = 1;
            System.out.printf("Factorial of %d is %d\n", intFactorialToBeFoundFor, factorial);
        } else if(intFactorialToBeFoundFor > 0){
            do{
                factorial = factorial * cntI;
                cntI++;
            } while(cntI < intFactorialToBeFoundFor + 1);
            System.out.printf("Factorial of %d is %d\n", intFactorialToBeFoundFor, factorial);
        } else {
            System.out.println("Factorial is not possible");
        }
    }
}
