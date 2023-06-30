package ru.papajohns.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://papajohns.ru";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

    }
}
