package main.javacore.ZZFcomportamentoporparametro.predicate;

import main.javacore.ZZFcomportamentoporparametro.classes.Carro;
import main.javacore.ZZFcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate
{
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
