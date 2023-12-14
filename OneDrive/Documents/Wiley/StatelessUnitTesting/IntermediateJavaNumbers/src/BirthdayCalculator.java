import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class BirthdayCalculator {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Magical BirthDAY Calculator!");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        System.out.println("Enter month");
        String month = sc.nextLine();

        System.out.println("Enter day");
        String day = sc.nextLine();

        System.out.println("Enter year");
        String year = sc.nextLine();


        String combine = month + "/" + day + "/"+ year;
        LocalDate ld = LocalDate.parse(combine, formatter);
        String formatted = ld.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(formatted);

        LocalDate now = LocalDate.now();

        String currentYear = String.valueOf(now.getYear());

        combine = month + "/" + day + "/"+ currentYear;
        LocalDate future = LocalDate.parse(combine, formatter);

        long diff = 0;
        if (now.isBefore(future)){
            diff = now.until(future, DAYS);
        }
        else{
            currentYear = String.valueOf(now.getYear() + 1);
            combine = month + "/" + day + "/"+ currentYear;
            future = LocalDate.parse(combine, formatter);

            diff = now.until(future, DAYS);
        }

        System.out.printf("%d days until next birthday",diff);


        

    }
}
