import java.util.Scanner;
public class RootsOfQuadraticEquation {
    // Roots of equation (-b +/- (b * b - 4 * a *c )) / (2 * a)
    // Equation is of the form a x^2 + b x + c = 0
    public static void main(String [] args){
        // Define variables
        double dblA, dblB, dblC;
        //
        Scanner inputObject = new Scanner(System.in);
        System.out.println("The form of the quadratic equation is a x^2 + b x + c = 0");
        System.out.println("Enter the values of a, b and c of the quadratic equation:");
        System.out.println("Enter the value of a : ");
        dblA = inputObject.nextDouble();
        System.out.println("Enter the value of b : ");
        dblB = inputObject.nextDouble();
        System.out.println("Enter the value of c : ");
        dblC = inputObject.nextDouble();
        double dblDiscriminant;
        // Discriminant  = b * b  - 4 * a * c
        dblDiscriminant = (dblB * dblB) - (4 * dblA * dblC);
        double dblRoot1, dblRoot2;

        if (dblDiscriminant > 0.0){
            // Two Real and distinct roots exist
            dblRoot1 = (-dblB + Math.sqrt(dblB * dblB - 4 * dblA * dblC )) / (2 * dblA);
            dblRoot2 = (-dblB - Math.sqrt(dblB * dblB - 4 * dblA * dblC )) / (2 * dblA);
            System.out.printf("Root 1 = %f and Root 2 = %f", dblRoot1, dblRoot2);
        } else if(dblDiscriminant == 0.0){
            // Two Real and equal roots exist
            dblRoot1 = -dblB / (2*dblA);
            dblRoot2 = dblRoot1;
            System.out.printf("Root 1 = %f and Root 2 = %f", dblRoot1, dblRoot2);
        }else {
            // Two Imaginary Roots exist
            double dblReal, dblImaginary;
            dblReal = -dblB / (2*dblA);
            dblImaginary = Math.sqrt(-1 * (dblB * dblB - 4 * dblA * dblC) ) / (2 * dblA);
            System.out.printf("Root 1 = %.2f + %.2fi and Root 2 = %.2f - %.2fi", dblReal, dblImaginary, dblReal, dblImaginary);
        }
    }
}
