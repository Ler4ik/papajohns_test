package ru.papajohns.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LocationModal {

    SelenideElement
            addressInput = $("#modal").$("#address_in_line"),
            submitButton = $("#modal").$$("button").findBy(text("Да")),
            cancelButton = $("#modal").$$("button").findBy(text("Нет"));

    @Step("Отрыть окно выбора адреса")
    public LocationModal openPage(){
        open("");

        return this;
    }

    @Step("Нажать \"Да\"")
    public LocationModal clickSubmitButton(){
        submitButton.click();

        return this;
    }

    @Step("Нажать \"Нет\"")
    public LocationModal clickCancelButton(){
        cancelButton.click();

        return this;
    }

    @Step("Заполнить адрес")
    public LocationModal setAddress(String address){
        addressInput.setValue(address);
        $$("#modal .SuggestionsPapajohns ul li").findBy(text(address)).click();

        return this;
    }



}