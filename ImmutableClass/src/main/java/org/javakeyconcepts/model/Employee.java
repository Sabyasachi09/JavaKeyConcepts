package org.javakeyconcepts.model;

import java.time.LocalDate;
import java.util.Date;

/*
* Let's make Employee class immutable.
* To make Employee class immutable, let's follow these practices:
* 1. Make the class final, so that it cannot be extended.
* 2. Make all fields private, so that direct access is not allowed.
* 3. Make all the fields final, so that values can be assigned only once.
* 4. Do not provide setter(mutator) methods. Initialize all fields using constructor,
*       that performs deep copy or defensive copying for mutable fields like: date, List, Map.
* 5. Clone objects in the getter methods to return a copy rather than returning the actual object reference.
* */
public final class Employee {
    private final long id; // immutable
    private final String name; // immutable
    private final LocalDate doj; // immutable
    private final Date dob; // mutable
    private final double salary; // immutable
    private final int totalExperience; // immutable

    public Employee(long id, String name, LocalDate doj, Date dob, double salary, int totalExperience){
        // Can shallow copy immutable fields: long, String, LocalDate, double, int
        // Must perform deep/defensive copy for mutable fields like: date, List
        this.id = id;
        this.name = name;
        this.doj = doj;
        this.dob = new Date(dob.getTime());
        this.salary = salary;
        this.totalExperience = totalExperience;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getDoj(){
        return this.doj;
    }

    public Date getDob(){
        return (Date) dob.clone();
    }

    public double getSalary(){
        return this.salary;
    }

    public int getTotalExperience(){
        return this.totalExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", dob=" + dob +
                ", salary=" + salary +
                ", totalExperience=" + totalExperience +
                '}';
    }
}
