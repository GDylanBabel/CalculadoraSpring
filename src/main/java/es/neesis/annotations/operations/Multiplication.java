package es.neesis.annotations.operations;

import es.neesis.annotations.applications.CalculatorApp;

public class Multiplication implements Operation {

    @Override
    public void execute(CalculatorApp state) {
        double result = state.getOperand_1() * state.getOperand_2();
        System.out.printf("%.4f * %.4f = %.2f %n%n", state.getOperand_1(), state.getOperand_2(), result);
    }
}
