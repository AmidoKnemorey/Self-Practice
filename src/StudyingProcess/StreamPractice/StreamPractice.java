package StudyingProcess.StreamPractice;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;

public class StreamPractice {
    public static void main(String[] args) {

        List<Employee> allEmployees = new ArrayList<>(3);

        allEmployees.add(new Employee(654346, 28500.0, "Stefan"));
        allEmployees.add(new Employee(546357, 23700.0,"Richter"));
        allEmployees.add(new Employee(754578, 35500.0,"Capone"));
        allEmployees.add(new Employee(354578, 37500.0,"Armstrong"));
        allEmployees.add(new Employee(785656, 40946.0,"Colombo"));
        allEmployees.add(new Employee(164357, 31020.0,"Johnson"));
        allEmployees.add(null);

        int[] arrayOfSomeNumbers = {81, 226, 505, 291, 606, 103, 105, 607, 97, 591, 502, 982, 88, 101, 133};

//        System.out.printf("Sum of numbers 1 - 10 is: %d%n", IntStream.rangeClosed(1, 10).sum());

//        seventhExercise(allEmployees);

//        Iterator<Employee> iterator = eighthExercise(allEmployees).listIterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

    ninthExercise(allEmployees);
    }


    private static void sixthExercise (int [] arrayOfDifferentNumbers) {
        List<String> result = new ArrayList<>(arrayOfDifferentNumbers.length);
        try {
            Arrays.stream(arrayOfDifferentNumbers).forEach(element -> result.add(element % 2 == 0 ? ("yep"+element) : ("nope"+element)));
            System.out.println(result);
        } catch (Exception exception) {
            System.err.println("Something went wrong.");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void seventhExercise (List<Employee> allEmployeesWithinMethod ) {
        /*find the concrete employees using a filter through the salary
        first approach*/

        try {
            allEmployeesWithinMethod.stream().filter(worker -> worker.getSalary() > 30000).forEach(System.out::println);
        } catch (NullPointerException nullPointerException) {
            System.err.printf("%nSome files not contain information about employee and are empty.");
        }

        /*second approach to find just first employee which has a salary higher than the indicated */

//        try {
//            System.out.println(allEmployeesWithinMethod.stream().filter(Objects::nonNull)
//                    .filter(worker -> worker.getSalary() >= 60000.0)
//                    .findAny()
//                    .orElseThrow(NoSuchElementException::new));
//        } catch (NoSuchElementException noSuchElementException) {
//            System.err.println("Not found any matches.");   }
    }

    private static List<Employee> eighthExercise (List<Employee> allEmployees) {
            return allEmployees.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Employee::getSurname)).toList();
    }

    private static void ninthExercise (List<Employee> allEmployees) {
        double maxSalary = allEmployees.stream()
                .filter(Objects::nonNull)
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NullPointerException::new);

        System.out.println(maxSalary);
    }

}



class Employee {

    private final int id;
    protected BigDecimal salary;
    private final String surname;

    public Employee(final int personalId, double salary, final String surname) {
        this.id = personalId;
        this.salary = new BigDecimal(salary);
        this.surname = surname;
    }

    public int getPersonalId() {
        return this.id;
    }
    public Double getSalary() {
        return Double.valueOf(String.valueOf(this.salary));
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return String.format("Worker %s %d, salary is %s.", this.getSurname(), this.id, this.salary);
    }
}