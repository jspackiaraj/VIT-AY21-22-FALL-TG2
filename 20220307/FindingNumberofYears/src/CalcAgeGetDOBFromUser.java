import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.*;
import java.util.*;
public class CalcAgeGetDOBFromUser {
    public static void main(String[] args){
        // The birthday is a constant
        LocalDate LDBirthday_local = LocalDate.of(2004,5,25);
        // Date Time is constant
        // AIM: To get the current date and calculate Age.
        // LocalDate LDToday_local = LocalDate.of(2022,3,7);
        // Step 1: Get the system time
        //
        Date currDate = new Date();
        DateTimeFormatter dtfDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ldtCurrentDate =  LocalDateTime.now();
        System.out.println("Today's Date is : " + dtfDateFormat.format(ldtCurrentDate));
        System.out.println("The Year is         : " + ldtCurrentDate.getYear());
        System.out.println("The month is        : " + ldtCurrentDate.getMonthValue());
        System.out.println("The day of month is : " + ldtCurrentDate.getDayOfMonth());
        LocalDate LDToday_local = LocalDate.of(ldtCurrentDate.getYear(),ldtCurrentDate.getMonthValue(),ldtCurrentDate.getDayOfMonth());
        // Get the Date of birth from user
        Scanner inputObject = new Scanner(System.in);
        String strBirthdayInputByUser;
        DateTimeFormatter dtfBirthdayFormat = DateTimeFormatter.ofPattern("dd-MM-yyy");
        System.out.print("Enter the birthday in the format \"dd-MM-yyy\"");
        strBirthdayInputByUser = inputObject.next();
        System.out.printf("The entered birthday is %s \n", strBirthdayInputByUser);

        long lngTime = ChronoUnit.MONTHS.between(LDToday_local, LDBirthday_local);

        Period perTimeBetween  = Period.between(LDBirthday_local,LDToday_local);
        System.out.print("Age is " + perTimeBetween.getYears() + " Years, " + perTimeBetween.getMonths() + " months\n");
        System.out.print(Math.abs(lngTime));
    }
}
