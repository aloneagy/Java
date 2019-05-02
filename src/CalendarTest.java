import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month =date.getMonthValue();
        int today =date.getDayOfMonth();

        date=date.minusDays(today -1);
        DayOfWeek weekend =date.getDayOfWeek();
        int value =weekend.getValue();

        System.out.println("Mon Tue wed Thu Fri Sat Sun");
        for(int i=1;i<value;i++)
            System.out.println(" ");
        while(date.getMonthValue() ==month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.println("*");
            else
                System.out.print("");
            date =date.plusDays(1);
            if(date.getDayOfWeek().getValue() ==1)System.out.println();

        }
        if(date.getDayOfWeek().getValue()!=1)System.out.println();


    }
}
