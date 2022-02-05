package FirstMiniProjects.Calculator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InputHandler {

    private final Scanner mainScanner = new Scanner(System.in);
    private final Pattern inputFilterPattern = Pattern.compile("\\d+|[+\\-*()/]");
    private static final InputHandler Instance = new InputHandler();

    private InputHandler() {
    }

    public static InputHandler getInstance() {
        return Instance;
    }

    public void input() {
        List<String> wholeEquation = new ArrayList<>();
        Matcher matcher = inputFilterPattern.matcher(scanningConsole());
        while (matcher.find()) {
                wholeEquation.add(matcher.group());
            }
        if (checkingSyntaxOfEquation(wholeEquation)){
            PriorityHandler.getInstance().isEquationHasBrackets(wholeEquation);
        } else {
            input();
        }
    }

    public String scanningConsole() {
        System.out.println("Input an equation using next symbols: Digits and + - * / ( ). ^");
            return mainScanner.nextLine();
    }

    private boolean checkingSyntaxOfEquation(List<String> fullEquation) {
        final Set<String> samplesOfNecessaryElementsToCompare = Set.of("+", "-", "*", "/");
        int amountOfOpeningBrackets = 0, amountOfClosingBrackets = 0;
        if (fullEquation.size() < 3) {
            System.err.println("Minimum 3 symbols.");
            return false;
        }
        for (int i = 0; i < fullEquation.size()-1; i++) {
            if (samplesOfNecessaryElementsToCompare.contains(fullEquation.get(i)) & samplesOfNecessaryElementsToCompare.contains(fullEquation.get(i+1))){
                System.err.println("Incorrect syntax, double the same operator.");
                return false;
            } else if (fullEquation.get(i).equals(")") & fullEquation.get(i + 1).equals("(")){
                System.err.println("No one operator or equation between brackets.");
                return false;
            } else if (fullEquation.get(i).equals("(") & fullEquation.get(i + 1).equals(")")){
                System.err.println("Empty brackets.");
                return false;
            } else if (fullEquation.get(i).equals("(")){
                amountOfOpeningBrackets++;
            } else if (fullEquation.get(i).equals(")")){
                amountOfClosingBrackets++;
            }
        } if (fullEquation.get(fullEquation.size()-1).equals("(")) {
                amountOfOpeningBrackets++;
            } else if (fullEquation.get(fullEquation.size()-1).equals(")")){
            amountOfClosingBrackets++;
        }
        if (amountOfOpeningBrackets != amountOfClosingBrackets){
            System.err.println("Unsymmetrical number of brackets.");
            return false;
        } return true;
    }
}