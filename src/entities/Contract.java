package entities;

import java.time.LocalDate;


public class Contract {
    private int number;
    private LocalDate date;
    private Double totalValue;


    public Contract(int number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }




    public LocalDate getDate() {
        return date;
    }



    public Double getTotalValue() {
        return totalValue;
    }


}
