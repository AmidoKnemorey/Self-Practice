package PracticingWithOOP.People;

public final class Lecturer extends Person {
    SpecialtyAtUniversity specialtyAtUniversity;
    double salaryOfLecturer;

    public Lecturer(String enterName, String enterSurname, String enterAddress, SpecialtyAtUniversity specialtyAtUniversity, double salaryOfLecturer){
        super(enterName, enterSurname, enterAddress);
        this.specialtyAtUniversity = specialtyAtUniversity;
        this.salaryOfLecturer = salaryOfLecturer;
    }

    public void setSpecialtyAtUniversity(SpecialtyAtUniversity specialtyAtUniversity) {
        this.specialtyAtUniversity =  specialtyAtUniversity;
    }

    public void setSalaryOfLecturer(double salaryOfLecturer){
        this.salaryOfLecturer = salaryOfLecturer;
    }

    public SpecialtyAtUniversity getSpecialtyAtUniversity() {
        return this.specialtyAtUniversity;
    }

    public Double getSalaryOfLecturer() {
        return this.salaryOfLecturer;
    }

    public void testMethodFromLecturer(){
        System.out.println("I'm a testHandlingException method and I was called from Lecturer subclass");
    }

    @Override
    public String toString() {
        return String.format("Lecturer %s, specialty is %s, salary per year is %f.", super.toString(), this.specialtyAtUniversity, this.salaryOfLecturer);
    }
}