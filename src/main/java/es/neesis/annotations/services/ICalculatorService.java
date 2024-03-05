package es.neesis.annotations.services;

import es.neesis.annotations.applications.CalculatorApp;
import es.neesis.annotations.operations.Operation;

public interface ICalculatorService {

    public void executeOperation(Operation operation, CalculatorApp state);

}
