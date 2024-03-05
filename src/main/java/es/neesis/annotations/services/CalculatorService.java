package es.neesis.annotations.services;

import es.neesis.annotations.applications.CalculatorApp;
import es.neesis.annotations.operations.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

  @Override
  public void executeOperation(Operation operation, CalculatorApp state) {
      operation.execute(state);
  }
}
