import java.time.temporal.ChronoUnit;
import java.time.*;

public class AgeToJoinVIT {
    public static void main(String[] args){


        LocalDate LDBirthday_local = LocalDate.of(2004,5,25);
        LocalDate LDToday_local = LocalDate.of(2022,3,7);
        //
        long lngTime = ChronoUnit.MONTHS.between(LDToday_local, LDBirthday_local);

        Period perTimeBetween  = Period.between(LDBirthday_local,LDToday_local);
        System.out.print("Age is " + perTimeBetween.getYears() + " Years, " + perTimeBetween.getMonths() + " months\n");
        System.out.print(Math.abs(lngTime));
    }
}
