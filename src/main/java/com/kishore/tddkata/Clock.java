package com.kishore.tddkata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Clock {

    public String todayAsString() {
        return today().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    protected LocalDate today() {
        return LocalDate.now();
    }
}
