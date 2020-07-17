package singleresponsability.goodpractices.enumway;

public enum LanguageEnum {

    PORTUGUESE {
        public String sayHello() {
            return "Olá mundo";
        }
    },
    ITALIAN {
        public String sayHello() {
            return "Ciao mondo";
        }
    },
    FRENCH {
        public String sayHello() {
            return "Bonjour le monde";
        }
    },
    SPANISH {
        public String sayHello() {
            return "Hola Mundo";
        }
    },
    GERMAN {
        public String sayHello() {
            return "Hallo Welt";
        }
    },
    DEFAULT {
        public String sayHello() {
            return "Hello world";
        }
    };

    public abstract String sayHello();
}
