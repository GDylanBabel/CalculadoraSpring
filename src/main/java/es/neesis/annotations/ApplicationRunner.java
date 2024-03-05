package es.neesis.annotations;

import es.neesis.annotations.applications.CalculatorApp;
import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.ui.UIPresenter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

    // Inyección de depedendecias mediante constructor
    CalculatorApp application = context.getBean(CalculatorApp.class);
    boolean isActive = true;
    while (isActive) {
      UIPresenter.showUI();
      try {
        isActive = application.ejecutar(UIPresenter.getCommand());
      } catch (RuntimeException runtimeException) {
        System.err.println(runtimeException.getMessage());
      }
    }
  }
}
