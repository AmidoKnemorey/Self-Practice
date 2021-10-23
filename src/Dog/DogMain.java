package Dog;

public class DogMain {
    public static void main(String[] args) {
       Dog puszek = new Dog("rex", 50);
       Dog okuszek = puszek;

       puszek.setWeight(50.5);

        System.out.println(okuszek);


    }
}
