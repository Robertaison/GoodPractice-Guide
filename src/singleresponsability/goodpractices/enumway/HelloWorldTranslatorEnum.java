package singleresponsability.goodpractices.enumway;

public class HelloWorldTranslatorEnum {

    public static String writeIn(final LanguageEnum language) {
        return language.sayHello();
    }

}
