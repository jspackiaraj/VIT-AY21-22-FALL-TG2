import java.util.Scanner;
public class CylinderProperties {
    public static void main(String[] args){
        // Create a class which will take user input and calculate the
        // Surface area, circumference and volume of a cylinder.
        // Declare and Initialize variables
        float fltRadius = 0,
              fltHeight = 0,
              fltCircumference = 0,
              fltSurfaceArea = 0,
              fltVolume = 0,
              pi = (float)Math.PI;
        char charConfirm = 'N';
        char charHelpStatus = 'Y';
        // Note that we use '' for character data type.
        // Initialize the scanner object
        Scanner inputObject = new Scanner(System.in);
        // Set up a loop
        do{
            System.out.printf(":: WELCOME TO THE CYLINDER PROPERTIES PROGRAM ::");
            if (charHelpStatus == 'Y' || charHelpStatus == 'y'){
                System.out.println("\nHow to use this program.");
                System.out.println("This program takes values of radius and height of cylinders in 'mm' and gives the answer in mm^2 or mm^3 as the case may be");
                System.out.println("The program will display results to two decimal places.");
                System.out.println("The program will calculate the geometric properties of different cylinder till you wish to exit the code");
                System.out.println("Press 'Y' if you wish to see this message again during this run.  'N' to only execute the program: (Y / N)  ");
                charHelpStatus = inputObject.next().charAt(0);
            }
            // Block of code to get input from the user:
            System.out.print("\nEnter the radius of the cylinder : (mm) ");
            fltRadius = inputObject.nextFloat();
            System.out.print("Enter the height of the cylinder : (mm) ");
            fltHeight = inputObject.nextFloat();
            fltCircumference = pi * 2 * fltRadius;
            fltSurfaceArea = pi * (2 * fltRadius * fltRadius + 2 * fltRadius * fltHeight);
            fltVolume = pi * fltRadius * fltRadius * fltHeight;
            System.out.printf("\nThe circumference of the cylinder is %.2f mm", fltCircumference);
            System.out.printf("\nThe Surface area  of the cylinder is %.2f mm^2", fltSurfaceArea);
            System.out.printf("\nThe Volume        of the cylinder is %.2f mm^3", fltVolume);
            System.out.println("""
                               \nDo you wish to continue to use the program or exit the program?
                               \nY to Continue, N to Exit : (Y / N) """);
            // We are introducing text blocks in the line above.  """  and """ encloses a text block
            // A text block is executed as it appears.  A newline character should always be after
            // the opening """  Refer the lines for a sample piece of code.
            charConfirm = inputObject.next().charAt(0);
        }while (charConfirm == 'y' || charConfirm =='Y');
    }
}
