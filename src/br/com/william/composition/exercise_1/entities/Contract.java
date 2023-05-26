package br.com.william.composition.exercise_1.entities;

import java.util.Date;

public class Contract {
    private final Date date;
    private final Double valuePerHour;
    private final Integer hours;

    public Contract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }
}
