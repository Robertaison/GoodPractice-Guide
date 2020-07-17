package singleresponsability.goodpractices.strategy;

public class Italian implements Language {

    @Override
    public String sayHello() {
        return "Ciao mondo";
    }
}
