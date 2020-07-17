package singleresponsability.goodpractices.strategy;

public class HelloTranslatorStrategy {
    public static String writeIn(final Language language) {
        return language.sayHello();
    }
}
