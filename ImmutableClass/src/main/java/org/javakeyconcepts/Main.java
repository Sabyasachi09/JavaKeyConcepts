package org.javakeyconcepts;

import org.javakeyconcepts.model.Employee;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
* Immutable class in java
* Immutable classes prevent state changes after object creation. Once constructed, an immutable object’s internal state
* cannot be modified. This makes code more predictable and easier to understand.
*
* Immutability enhances thread safety without synchronization. Because immutable objects can’t be changed,
* they can be safely shared between threads without requiring locks or synchronized blocks.
* */
public class Main {
    /*
    * We have Employee class which is immutable, let's test its immutability by creating objects with initial values,
    * then trying to change the values that object holds.
    * If the object do not change then we have a perfect immutable class.
    * */
    public static void main(String[] args) {
        long id = 505343L;
        String name = "John Wick";
        LocalDate doj = LocalDate.now();
        Date dob = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        double salary = 10000.00;
        int totalExperience = 10;

        Employee employee = new Employee(id, name, doj, dob, salary, totalExperience);
        System.out.println("Original Employee: ");
        System.out.println("Id: "+employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Date of joining: "+employee.getDoj());
        System.out.println("Date of birth: "+employee.getDob());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Total years of experience: "+employee.getTotalExperience());

        // Modify fields passed for object creation to test immutability of the class;
        id = 101347L;
        name = "Lizy Sims";
        doj = LocalDate.parse("2022-12-12");
        dob = new GregorianCalendar(2022, Calendar.DECEMBER, 31).getTime();
        salary = 20000.00;
        totalExperience = 11;

        System.out.println("Employee after changing field values passed for object creation: ");
        System.out.println("Id: "+employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Date of joining: "+employee.getDoj());
        System.out.println("Date of birth: "+employee.getDob());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Total years of experience: "+employee.getTotalExperience());
    }
}