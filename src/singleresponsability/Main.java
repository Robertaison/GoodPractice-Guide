package singleresponsability;

import singleresponsability.badpractices.HelloWorldTranslatorBad;
import singleresponsability.goodpractices.enumway.HelloWorldTranslatorEnum;
import singleresponsability.goodpractices.enumway.LanguageEnum;
import singleresponsability.goodpractices.strategy.Default;
import singleresponsability.goodpractices.strategy.HelloTranslatorStrategy;
import singleresponsability.goodpractices.strategy.Portuguese;

public class Main {
    public static void main(String[] args) {

        System.out.println(HelloWorldTranslatorBad.writeDefault());
        System.out.println(HelloWorldTranslatorBad.writeIn("portuguese"));
        System.out.println();

        System.out.println("=== Enum Way =========");
        System.out.println(HelloWorldTranslatorEnum.writeIn(LanguageEnum.DEFAULT));
        System.out.println(HelloWorldTranslatorEnum.writeIn(LanguageEnum.GERMAN));
        System.out.println();

        System.out.println("=== Strategy =========");
        System.out.println(HelloTranslatorStrategy.writeIn(new Default()));
        System.out.println(HelloTranslatorStrategy.writeIn(new Portuguese()));
        System.out.println();
    }
}
