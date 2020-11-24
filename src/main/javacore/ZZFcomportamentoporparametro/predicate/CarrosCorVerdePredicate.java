package main.javacore.ZZFcomportamentoporparametro.predicate;

import main.javacore.ZZFcomportamentoporparametro.classes.Carro;
import main.javacore.ZZFcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
