package es.neesis.annotations.applications;

import es.neesis.annotations.operations.*;
import es.neesis.annotations.services.CalculatorService;
import es.neesis.annotations.ui.UIPresenter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CalculatorApp {

  private Map<String, Operation> operaciones = new HashMap<String, Operation>();
  private double operand_1;
  private double operand_2;
  private final CalculatorService calculatorService;

  public CalculatorApp(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
    // Se instancian las operaciones
    operaciones.put("sumar", new Addition());
    operaciones.put("restar", new Substraction());
    operaciones.put("multiplicar", new Multiplication());
    operaciones.put("dividir", new Division());
  }

  public boolean ejecutar(String command) {
    // Usamos toLowerCase para que no haya errores de texto
    if (operaciones.containsKey(command.toLowerCase())) {
      Operation operation = operaciones.get(command.toLowerCase());
      this.operand_1 = UIPresenter.getOperand_1();
      this.operand_2 = UIPresenter.getOperand_2();

      this.calculatorService.executeOperation(operation, this);
      return true;
    } else if (command.toLowerCase().equals("salir")) return false;
    System.err.println("Ese comando no existe");
    return true;
  }

  public double getOperand_1() {
    return operand_1;
  }

  public double getOperand_2() {
    return operand_2;
  }
}
