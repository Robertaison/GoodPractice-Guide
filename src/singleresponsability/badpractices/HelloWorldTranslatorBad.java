package singleresponsability.badpractices;

public class HelloWorldTranslatorBad {

    public static String writeDefault() {
        return "Hello world";
    }

    public static String writeIn(final String language) {

        if(language.equals("portuguese")) {
            return "Olá mundo";
        }

        if(language.equals("italian")) {
            return "Ciao mondo";
        }

        if(language.equals("french")) {
            return "Bonjour le monde";
        }

        if(language.equals("spanish")) {
            return "Hola Mundo";
        }

        if(language.equals("german")) {
            return "Hallo Welt";
        }

        return "unknown language";
    }
}
