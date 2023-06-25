package ru.papajohns.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Simple_test extends TestBase {

    @Test
    public void firsttest(){
        open("");
        $$("button").findBy(text("Да")).click();
        sleep(3000);
    }

}
