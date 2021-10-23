package Example;

import static java.lang.System.out;

public class Mini_game {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 6 + 1);
        out.println("Your number is "+result);
        switch (result) {
            case 1,3,5:
                out.println("Unpaired number.");
                break;
            case 2,4:
                out.println("Paired number.");
                break;
            case 6:
                out.println("Paired number. You win.");
        }
    }
}
