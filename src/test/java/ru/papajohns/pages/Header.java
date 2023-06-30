package ru.papajohns.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Header {

    SelenideElement
            deliveryPanel = $("button.AddressButton"),
            languageRu = $$("button").findBy(text("ru")),
            languageEn = $$("button").findBy(text("en")),
            href = $("#Header a");


}
