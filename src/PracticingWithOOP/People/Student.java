package PracticingWithOOP.People;

import java.math.BigDecimal;
import java.time.LocalDate;

final class Student extends Person {
    String facultyOfEducation;
    LocalDate yearOfBeginning;
    BigDecimal priceOfEducation;


    public Student(String name, String surname, String address, String facultyOfEducation, LocalDate yearOfGraduation, double priceOfEducation) {
        super(name, surname, address);
        this.facultyOfEducation = facultyOfEducation;
        this.yearOfBeginning = yearOfGraduation;
        this.priceOfEducation = BigDecimal.valueOf(priceOfEducation);
    }

    public Student() {
        super("John", "Smith", "Chicago, Border st. 15/5");
        this.facultyOfEducation = "ECONOMY";
        this.yearOfBeginning = LocalDate.of(2000,12,30);
        this.priceOfEducation = BigDecimal.valueOf(5000.5);
    }

    public String getFacultyOfEducation() {
        return this.facultyOfEducation;
    }

    public LocalDate getYearOfGraduation() {
        return this.yearOfBeginning;
    }

    public BigDecimal getPriceOfEducation() {
        return this.priceOfEducation;
    }

    public void setFacultyOfEducation(String facultyOfEducation) {
        this.facultyOfEducation = facultyOfEducation;
    }

    public void setYearOfEducation(LocalDate yearOfGraduation) {
        this.yearOfBeginning = yearOfGraduation;
    }

    public void setPriceOfEducation(BigDecimal priceOfEducation) {
        this.priceOfEducation = priceOfEducation;
    }

    public void testMethodFromStudent(){
        System.out.println("I'm a testHandlingException method and I was called from Student subclass ");
    }

    public void suddenlyBecameLazy() {
        System.out.println("I'm lazy bones now and don't wanna do something");
    }

    @Override
    public String toString() {
        return String.format("Student %s which studying on the faculty %s, date of beginning %s, price of education %f",
                super.toString(), this.facultyOfEducation, this.yearOfBeginning, this.priceOfEducation);
    }
}