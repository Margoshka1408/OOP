package HomeWork7;


import HomeWork7.Controller.CalculatorController;
import HomeWork7.View.CalculatorInput;


public class Main {
    public static void main(String[] args) {
        CalculatorInput calculatorInput = new CalculatorInput();
        CalculatorController calculatorController = new CalculatorController(calculatorInput);
        calculatorController.realizeCalculate();
    }
}
