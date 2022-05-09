package com.company;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

    public Animal pet;
    private Car car;
    protected Double salary;

    protected Double valueOfTheCar;
    public int cash;
    public String name;

    public Animal getPet() {
        return pet;
    }

    public Car getCar() {
        return car;
    }

    public String getCarToString() {
        return car.toString();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getValueOfTheCar() {
        return valueOfTheCar;
    }

    public void setValueOfTheCar(Double valueOfTheCar) {
        if (valueOfTheCar < this.salary) {
            System.out.println("Udało się kupić auto za gotówkę!");
            car = new Car("BMW", "XY") {
                @Override
                protected void refuel() {
                    System.out.println("Paliwko ++");
                }
            };

            car.Value = valueOfTheCar;
        } else if (valueOfTheCar / 12 < this.salary) {
            System.out.println("Udało się kupić auto na kredyt!");
            car = new Car("BMW", "XY") {
                @Override
                protected void refuel() {
                    System.out.println("Paliwko ++");
                }
            };

            car.Value = valueOfTheCar;
        } else {
            System.out.println("idź wybłagaj szefa o podwyżkę");
        }

        this.valueOfTheCar = valueOfTheCar;
    }
        public Double getSalary () {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println("Kiedy pobarne zostały dane?" + formatter.format(date));
            return salary;
        }

        public void setSalary (Double salary) {
            if (salary < 0)
            System.out.println("Przepraszamy, ale nie można mieć wypłaty na minusie.");
            System.out.println("Dziękujemy, dane zostały wysłane do biura księgowego.");
            System.out.println("Informujemy o konieczności odbioru gotowego aneksu do umowy od Pani Hani z HR.");
            System.out.println("Informujemy, że ZUS i US zostały poinformowanie o zmianie wypłaty, nie ma sensu ukrywać dochodu.");
            this.salary = salary;
        }

}
