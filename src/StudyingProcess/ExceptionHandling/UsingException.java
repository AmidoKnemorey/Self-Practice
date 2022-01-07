package StudyingProcess.ExceptionHandling;

public class UsingException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] stackTraceElements = exception.getStackTrace();

            System.err.printf("%nStack trace from exception:%n");
            System.out.println("Class\t\t\t\t\t\t\tFile\t\t\t\t\tLine\tMethod");


            //TODO...
//            StackWalker stackWalker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
//            Optional<UsingException<>> usingException = stackWalker.walk(
//                    s -> s.map(StackWalker.StackFrame::getDeclaringClass)
//                            .filter(interestingClasses::contains) // <- What must be contained here? ^_^
//                            .findFirst());
            //TODO...



            for (StackTraceElement element : stackTraceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }

    private static void method1 () throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("Exception which is from method3.");
    }
}