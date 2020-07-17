package singleresponsability.goodpractices.strategy;

public class Portuguese implements Language {

    @Override
    public String sayHello() {
        return "Olá mundo";
    }
}