package singleresponsability.goodpractices.strategy;

public class Default implements Language {

    @Override
    public String sayHello() {
        return "Hello world";
    }
}
