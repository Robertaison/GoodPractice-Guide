package singleresponsability.goodpractices.strategy;

public class German implements Language {

    @Override
    public String sayHello() {
        return "Hallo Welt";
    }
}
