package FirstMiniProjects.Calculator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class CalculatingMachine {

    private static final CalculatingMachine INSTANCE = new CalculatingMachine();

    private CalculatingMachine(){
    }

    public static CalculatingMachine getInstance() {
        return INSTANCE;
    }

    public List<String> dividingAndMultiplyingHandler (List<String> equationWithDividingOrMultiplying) {
        System.out.println("dividingAndMultiplyingHandler method: "+equationWithDividingOrMultiplying);
        int indexOfOperator = equationWithDividingOrMultiplying.indexOf(equationWithDividingOrMultiplying.stream()
                .filter(operator -> operator.equals("*") || operator.equals("/"))
                .findFirst()
                .orElse(null));
        String operator = equationWithDividingOrMultiplying.get(indexOfOperator);
        int resultOfFirstMultiplyingOfDividing = solveSimpleTask(IntStream.range(equationWithDividingOrMultiplying.indexOf(operator)-1, equationWithDividingOrMultiplying.indexOf(operator)+2)
                .mapToObj(equationWithDividingOrMultiplying::get)
                .collect(Collectors.toList()));
        equationWithDividingOrMultiplying.set(indexOfOperator, String.valueOf(resultOfFirstMultiplyingOfDividing));
        equationWithDividingOrMultiplying.remove(indexOfOperator-1);
        equationWithDividingOrMultiplying.remove(indexOfOperator);
        return equationWithDividingOrMultiplying;
    }

    public List<String> subtractionAndAdditionHandler(List<String> equationWithSubtractionOrAddition) {
        System.out.println("subtractionAndAdditionHandler method: "+equationWithSubtractionOrAddition);
        int indexOfOperator = equationWithSubtractionOrAddition.indexOf(equationWithSubtractionOrAddition.stream()
                .filter(operator -> operator.equals("-") || operator.equals("+"))
                .findFirst()
                .orElse(null));
        String operator = equationWithSubtractionOrAddition.get(indexOfOperator);
        int result = solveSimpleTask(IntStream.range(equationWithSubtractionOrAddition.indexOf(operator)-1, equationWithSubtractionOrAddition.indexOf(operator)+2)
                .mapToObj(equationWithSubtractionOrAddition::get)
                .collect(Collectors.toList()));
        equationWithSubtractionOrAddition.set(indexOfOperator, String.valueOf(result));
        equationWithSubtractionOrAddition.remove(indexOfOperator-1);
        equationWithSubtractionOrAddition.remove(indexOfOperator);
        return equationWithSubtractionOrAddition;
    }

    public int solveSimpleTask(List<String> simpleTask) {
        System.out.println("solveSimpleTask method: "+simpleTask);
        String operator = simpleTask.get(1);
        return switch (operator) {
            case ("+") -> Integer.parseInt(simpleTask.get(0)) + Integer.parseInt(simpleTask.get(2));
            case ("-") -> Integer.parseInt(simpleTask.get(0)) - Integer.parseInt(simpleTask.get(2));
            case ("*") -> Integer.parseInt(simpleTask.get(0)) * Integer.parseInt(simpleTask.get(2));
            case ("/") -> Integer.parseInt(simpleTask.get(0)) / Integer.parseInt(simpleTask.get(2));
            default -> throw new ArithmeticException("Something went wrong in [solveSimpleTask] method.");
        };
    }

}
