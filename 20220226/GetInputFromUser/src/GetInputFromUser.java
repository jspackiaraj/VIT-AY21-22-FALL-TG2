import java.util.Scanner;
public class GetInputFromUser {
    //Get an input from the user
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("नमस्ते");
        System.out.println("வணக்கம்");
        Scanner inputObject = new Scanner(System.in);
        int FirstNumber;
        int SecondNumber;
        System.out.print("Please enter First number : ");
        FirstNumber = inputObject.nextInt();
        System.out.print("Please enter Second number : ");
        SecondNumber = inputObject.nextInt();
        int AddNumbers = FirstNumber + SecondNumber;
        System.out.printf("Sum of %d and %d is : %d \n", FirstNumber, SecondNumber, AddNumbers);
        // Which is the larger number
        // if construct
        if (FirstNumber == SecondNumber){
            System.out.printf("%d is equal to %d \n", FirstNumber, SecondNumber);
        }
        else if (FirstNumber > SecondNumber){
            System.out.printf("%d is greater than %d \n", FirstNumber, SecondNumber);
        }
        else {
            System.out.printf("%d is lesser than %d \n", FirstNumber, SecondNumber);
        }
        // Average of two numbers
        float Average;
        Average = (float)(FirstNumber + SecondNumber) / 2;
        System.out.printf("The average of the numbers is : %.3f \n", Average);
        // Average of an Array with 'n' elements
        int GetSizeOfArray;
        System.out.println("Enter the number of elements in the array: ");
        GetSizeOfArray = inputObject.nextInt();
        int intA[] = new int[GetSizeOfArray];
        int cnti;
        for (cnti =0; cnti < GetSizeOfArray; cnti++){
            System.out.printf("Enter the element no %d: ", cnti + 1);
            intA[cnti] = inputObject.nextInt();
        }
        int SumOfArrayElems = 0;
        for (cnti =0; cnti < GetSizeOfArray; cnti++){
            System.out.printf("The element no %d is %d \n", cnti + 1, intA[cnti]);
            SumOfArrayElems = SumOfArrayElems + intA[cnti];
        }
        System.out.printf("The sum of the elements of the array is %d: \n", SumOfArrayElems);
        int NumberOfElements;
        NumberOfElements = intA.length;
        System.out.printf("The number of elements of the array is %d: \n", NumberOfElements);
        System.out.printf("The mean of the elements of the array is %.3f: \n", (float)SumOfArrayElems / NumberOfElements);

    }
}
