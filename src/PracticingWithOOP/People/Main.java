package PracticingWithOOP.People;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //using my constructor and strong typing. Also, inheritance and polymorphism paradigms applied here
        Student student = new Student("Vasiliy", "Gromov", "New York, Lafayette Avenue 749/5", "IT",LocalDate.of(2007, 9, 1), 5486.78);
        System.out.println(student);//here works the "toString" method which co works with parent class
//        student.testMethodFromStudent();
//        student.testMethodFromPerson();
//        student.suddenlyBecameLazy();



        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");


        //Using the upcast I use exactly quintessence of the all OOP ?> overriding
        //using my default constructor and non-strong typing. Also, hope I use some polymorphism, encapsulation and inheritance
        Person student2 = new Student();
        //student2.testMethodFromPerson(); //I can't call the test method or any other method from the subclass, only from the parent class
        System.out.println(student2);// But I can call "toString" method which co works with parent class because o (Hope I'm right)
        System.out.println(student2.getClass().getName());
    }
}