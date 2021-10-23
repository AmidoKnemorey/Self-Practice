package WorkerEnterprise;

public class Worker {
    String name;
    String surname;
    int age;

    public Worker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Worker " + name + " " + surname + ", " + age + " years old.";
    }
}