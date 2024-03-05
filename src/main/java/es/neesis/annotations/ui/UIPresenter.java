package es.neesis.annotations.ui;

import java.util.Scanner;

public class UIPresenter {

  public static void showUI() {
    System.out.println("\nBienvenido a la calculadora, selecciona una operación:");
    System.out.println(
        "Sumar\n"
            + "Restar\n"
            + "Multiplicar\n"
            + "Dividir\n"
            + "Salir\n"
            + "Selecciona una operación: ");
  }

  public static String getCommand() {
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  public static double getOperand_1() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el primer operando: ");
    double op1 = 0;
    try {
      op1 = sc.nextDouble();
    } catch (Exception exception) {
      throw new RuntimeException(
          "Ese formato de número es inválido (Por favor, utilice ',' para los decimales)");
    }
    return op1;
  }

  public static double getOperand_2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el segundo operando: ");
    double op2 = 0;
    try {
      op2 = sc.nextDouble();
    } catch (Exception exception) {
      throw new RuntimeException(
          "Ese formato de número es inválido (Por favor, utilice ',' para los decimales)");
    }
    return op2;
  }
}
