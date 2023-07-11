package ru.netology.services.hwjava.cycles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ScheduleRWTest {

    @ParameterizedTest
    /*@CsvSource({
            "10000,3000,20000",
            "200000,60000,150000"

    })*/
    @CsvFileSource(files = "src/test/resources/schedule.csv")
    public void ScheduleRW(int income, int expenses, int threshold) {
        ScheduleRW service = new ScheduleRW();

        int actual = service.calculate(income, expenses, threshold);
        System.out.println(actual);
    }

}
