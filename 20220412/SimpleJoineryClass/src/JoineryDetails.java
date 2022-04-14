import java.util.*;
public class JoineryDetails {
    // Set the type of Joinery, Dimensions of the Joinery
    // Get the different attributes of the Joinery
    // Get the area of the joinery
    public static void main(String[] args) {
        double widthOfElement;
        double heightOfElement;
        String typeOfElement;
        String materialOfElement;
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the Width of the Element (in m) : ");
        widthOfElement = inputObject.nextDouble();
        System.out.print("Enter the Height of the Element (in m) : ");
        heightOfElement = inputObject.nextDouble();
        // NOTE THE LINE BELOW
        // There will be an additional \n character which is ignored by nextDouble.
        // When you have a nextDouble followed by another method, please have an empty
        // nextLine()
        inputObject.nextLine();
        System.out.print("Enter the type of the Element (DOOR / WINDOW) : ");
        typeOfElement = inputObject.nextLine();
        System.out.print("Enter the material of the Element : ");
        materialOfElement = inputObject.nextLine();
        Joinery element_001 = new Joinery(widthOfElement, heightOfElement, typeOfElement, materialOfElement);
        System.out.println("The area of the element is : " + element_001.joineryArea());
    }
}
