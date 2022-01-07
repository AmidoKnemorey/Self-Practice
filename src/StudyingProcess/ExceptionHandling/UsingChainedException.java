package StudyingProcess.ExceptionHandling;

public class UsingChainedException {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getCause()); // why to many getCause in order to find first exception
        }

    }


    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception notified within method1.", exception);
        }
    }


    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception notified within method2", exception);
        }
    }

    public static void method3() throws Exception {
        try {
            method4();
        } catch (Exception exception) {
            throw new Exception("Exception notified within method3", exception);
        }
    }

    private static void method4() throws Exception {
        throw new Exception("Exception notified within method4.");
    }
}