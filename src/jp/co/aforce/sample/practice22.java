package jp.co.aforce.sample;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class practice22 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(today.getYear(), 10, 5); // ←自分の誕生日に変更

        if (today.isAfter(birthday)) {
            birthday = birthday.plusYears(1);
        }

        long days = ChronoUnit.DAYS.between(today, birthday);

        System.out.println("誕生日まであと " + days + " 日です");
    }
}