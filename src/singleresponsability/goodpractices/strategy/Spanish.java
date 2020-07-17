package singleresponsability.goodpractices.strategy;

public class Spanish implements Language {

    @Override
    public String sayHello() {
        return "Hola Mundo";
    }
}
