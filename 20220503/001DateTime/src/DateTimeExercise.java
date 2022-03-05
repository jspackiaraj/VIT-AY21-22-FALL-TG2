import java.util.*;
import java.text.*;
public class DateTimeExercise {
    public static void main(String[] args){
        Date dNow = new Date();
        SimpleDateFormat dOutputStr = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz");
        System.out.println("The current time is " + dOutputStr.format(dNow));
        // A Simple time elapsed counter
        long dtProcessStartTime = System.nanoTime();
        // Do some work over here
        // For milli second use long dtProcessStartTime = System.currentTimeMillis()
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int intA = inputObject.nextInt();
        long dtProcessEndTime = System.nanoTime();
        System.out.println("Start time is " + dtProcessStartTime + "\n");
        System.out.println("End time is " + dtProcessEndTime + "\n");
        System.out.println("The entered integer was " + intA + "\n");
        System.out.println("The time elapsed in computation " + (dtProcessEndTime -  dtProcessStartTime ) + "\n");
    }
}
