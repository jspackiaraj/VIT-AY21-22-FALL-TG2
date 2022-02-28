public class MultiplicationTables {
    public static void main(String args[]){
        // Demonstration of the while loop
        int intTablesTill= 10;
        int intMultiplier = 1;
        int intTableToBePrinted;
        intTableToBePrinted = 9;
        //while is an entry controlled loop
        while ( intMultiplier < intTablesTill + 1){
            // This block of code executes when true
            System.out.printf("%d x %d = %d\n", intMultiplier,  intTableToBePrinted, intMultiplier * intTableToBePrinted);
            intMultiplier++;
        }
    }
}