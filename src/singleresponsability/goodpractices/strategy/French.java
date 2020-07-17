package singleresponsability.goodpractices.strategy;

public class French implements Language {

    @Override
    public String sayHello() {
        return "Bonjour le monde";
    }
}
