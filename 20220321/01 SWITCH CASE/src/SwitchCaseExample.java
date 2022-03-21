import java.util.Scanner;
public class SwitchCaseExample {
    // This program will print a Light color based on the key pressed
    // If the key entered is :
    //1 Blue Color Light
    //2 Yellow Color Light
    //3 Green Color Light
    //ERROR Red Color Light (For all other keys)
    // 0 to exit the program
    //Red for any other key stroke
    public static void main (String [] args){
        String strInputKeyStored; // variable declaration
        boolean boolIsProgramRunning = true;
        Scanner inputObject = new Scanner(System.in);
        do{
            System.out.print("Please enter your choice: (0 - 3) ");
            strInputKeyStored = inputObject.next();
            //System.out.println(strInputKeyStored.charAt(0));
            switch(strInputKeyStored.charAt(0)){
                case '0':
                    boolIsProgramRunning = false;
                    break;
                case '1':
                    System.out.println("Blue Color Light");
                    break;
                case '2':
                    System.out.println("Yellow Color Light");
                    break;
                case '3':
                    System.out.println("Green Color Light");
                    break;
                default:
                    System.out.println("ERROR Red  Color Light");
            }
        }while (boolIsProgramRunning);
        System.out.println("Exiting the program Normally ...");
    }
}
