package SingleClassWorks_2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewCalculator {

    public static void main(String[] args) {
        inputHandling();
    }

    private static void checkingForBrackets (List<String> fullEquation) {
        if (fullEquation.contains("(")) {
            findingBrackets(fullEquation);
            checkingForBrackets(fullEquation);
        } else {
            System.out.println(solvingEquationWithoutBrackets(fullEquation));
        }
    }

    private static void findingBrackets (List<String> possibleBracketsEquation) {
        System.out.println("findingBrackets method: "+possibleBracketsEquation);
        int lastOpeningBracketIndex = possibleBracketsEquation.lastIndexOf("(");
        int closingBracketIndex = possibleBracketsEquation.subList(lastOpeningBracketIndex, possibleBracketsEquation.size()).indexOf(")") + lastOpeningBracketIndex;
        int resultOfLastOpeningBrackets = solvingEquationWithoutBrackets
                    (IntStream.range(lastOpeningBracketIndex + 1, closingBracketIndex)
                    .mapToObj(possibleBracketsEquation::get)
                    .collect(Collectors.toList()));
        possibleBracketsEquation.set(lastOpeningBracketIndex, String.valueOf(resultOfLastOpeningBrackets));
        possibleBracketsEquation.subList(lastOpeningBracketIndex + 1, closingBracketIndex+1).clear();
    }

    private static int solvingEquationWithoutBrackets (List<String> equationWithoutBrackets) {
        System.out.println("solvingEquationWithoutBrackets method: "+equationWithoutBrackets);
        if (equationWithoutBrackets.size() == 3) {
            return solvingSimpleEquation(equationWithoutBrackets);
        } else if (equationWithoutBrackets.contains("*") || equationWithoutBrackets.contains("/")) {

            int indexOfOperator = equationWithoutBrackets.indexOf(equationWithoutBrackets.stream()
                    .filter(operator -> operator.equals("*") || operator.equals("/"))
                    .findFirst()
                    .orElse(null));

            String operator = equationWithoutBrackets.get(indexOfOperator);

            int result = solvingSimpleEquation(IntStream.range(equationWithoutBrackets.indexOf(operator)-1, equationWithoutBrackets.indexOf(operator)+2)
                    .mapToObj(equationWithoutBrackets::get)
                    .collect(Collectors.toList()));

            equationWithoutBrackets.set(indexOfOperator, String.valueOf(result));

            equationWithoutBrackets.remove(indexOfOperator-1);
            equationWithoutBrackets.remove(indexOfOperator);

            if (equationWithoutBrackets.size() == 3) {
                return solvingSimpleEquation(equationWithoutBrackets);
            } else {
                return solvingEquationWithoutBrackets(equationWithoutBrackets);
            }
        } else {
            int indexOfOperator = equationWithoutBrackets.indexOf(equationWithoutBrackets.stream()
                    .filter(operator -> operator.equals("-") || operator.equals("+"))
                    .findFirst()
                    .orElse(null));

            String operator = equationWithoutBrackets.get(indexOfOperator);

            int result = solvingSimpleEquation(IntStream.range(equationWithoutBrackets.indexOf(operator)-1, equationWithoutBrackets.indexOf(operator)+2)
                    .mapToObj(equationWithoutBrackets::get)
                    .collect(Collectors.toList()));

            equationWithoutBrackets.set(indexOfOperator, String.valueOf(result));

            equationWithoutBrackets.remove(indexOfOperator-1);
            equationWithoutBrackets.remove(indexOfOperator);

            if (equationWithoutBrackets.size() == 3) {
                return solvingSimpleEquation(equationWithoutBrackets);
            } else {
                return solvingEquationWithoutBrackets(equationWithoutBrackets);
            }
        }
    }

    private static int solvingSimpleEquation (List<String> equation) {
        System.out.println("solvingSimpleEquation method: "+equation);
        String operation = equation.get(1);
        return switch (operation) {
            case ("+") -> Integer.parseInt(equation.get(0)) + Integer.parseInt(equation.get(2));
            case ("-") -> Integer.parseInt(equation.get(0)) - Integer.parseInt(equation.get(2));
            case ("*") -> Integer.parseInt(equation.get(0)) * Integer.parseInt(equation.get(2));
            case ("/") -> Integer.parseInt(equation.get(0)) / Integer.parseInt(equation.get(2));
            default -> throw new ArithmeticException("Something went wrong.");
        };
    }

    private static void inputHandling() {
       /*       just samples of equations:
                8 -8*5      result is: 32
                (5+5-3)*(3-4)       result is: 7
                6+( (4+4) * 2 )     result is: 22
                6+( 2*(2+2) )       result is: 14
                6+(2*(2*(2+3)))     result is: 26
                8 / 4 + 3 * 2       result is: 8
                9*4-5/5*2-2+1       result is: 33
                30 + 5 * ( 4 - 3 )      result is: 8
                6+( 2+7*(2+(8-3)+2))+(2*2)      result is: 75
                62+( 12+7*(20+(8-3)+26))+(2*52)/2     result is: 483       */

        List<String> fullEquation = new ArrayList<>();

        try (Scanner scanner = new Scanner (System.in)){
            System.out.println("Input random equation using integers and \"( + - * / )\"");
            Pattern pattern = Pattern.compile("((\\d*\\.\\d+)|(\\d+)|([+\\-*()/]))");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                fullEquation.add(matcher.group());
            }
           if (fullEquation.stream().filter("("::equals).count() != fullEquation.stream().filter(")"::equals).count()) {
               throw new InputMismatchException("Asymmetric amount of opening and closing brackets.");
           }
            checkingForBrackets(fullEquation);
        } catch (IndexOutOfBoundsException | NumberFormatException exception) {
            System.err.println("Incorrect syntax of inputted equation.");
        } catch (InputMismatchException exception) {
            System.err.println(exception.getMessage());
        }
    }
}