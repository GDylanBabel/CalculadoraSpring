package es.neesis.annotations.operations;

import es.neesis.annotations.applications.CalculatorApp;

public interface Operation {

    public void execute(CalculatorApp state);

}
