package FirstMiniProjects.Calculator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PriorityHandler {

    private final static PriorityHandler INSTANCE = new PriorityHandler();

    private PriorityHandler(){
    }

    public static PriorityHandler getInstance(){
        return INSTANCE;
    }

    public void isEquationHasBrackets(List<String> fullEquation) {
        if (fullEquation.contains("(")) {
            findMostDeeperBrackets(fullEquation);
            isEquationHasBrackets(fullEquation);
        } else {
            System.out.println(operationsPriorityHandler(fullEquation));
        }
    }

    private static void findMostDeeperBrackets(List<String> equationWithBrackets) {
        System.out.println("findMostDeeperBrackets method: " + equationWithBrackets);

        int lastOpeningBracketIndex = equationWithBrackets.lastIndexOf("(");
        int firstClosingAfterLastOpeningBracketIndex = equationWithBrackets
                .subList(lastOpeningBracketIndex, equationWithBrackets.size())
                .indexOf(")") + lastOpeningBracketIndex;

        int resultOfMostDeeperBrackets = operationsPriorityHandler
                (IntStream.range(lastOpeningBracketIndex + 1, firstClosingAfterLastOpeningBracketIndex)
                        .mapToObj(equationWithBrackets::get)
                        .collect(Collectors.toList()));

        equationWithBrackets.set(lastOpeningBracketIndex, String.valueOf(resultOfMostDeeperBrackets));
        equationWithBrackets.subList(lastOpeningBracketIndex + 1, firstClosingAfterLastOpeningBracketIndex + 1).clear();
    }

    private static int operationsPriorityHandler(List<String> equationWithoutBrackets) {
    System.out.println("priorityHandler method: "+equationWithoutBrackets);
    if (equationWithoutBrackets.size() == 3) {
        return CalculatingMachine.getInstance().solveSimpleTask(equationWithoutBrackets);
    } else if (equationWithoutBrackets.contains("*") || equationWithoutBrackets.contains("/")) {
        return operationsPriorityHandler(CalculatingMachine.getInstance().dividingAndMultiplyingHandler(equationWithoutBrackets));
    } else {
        return operationsPriorityHandler(CalculatingMachine.getInstance().subtractionAndAdditionHandler(equationWithoutBrackets));
            }
    }
}