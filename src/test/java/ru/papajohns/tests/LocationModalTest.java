package ru.papajohns.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.papajohns.pages.Header;
import ru.papajohns.pages.LocationModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LocationModalTest extends TestBase{

    LocationModal modal = new LocationModal();
    Header header = new Header();

    @ParameterizedTest
    @ValueSource(strings = { "Никольская", "Славянская площадь, 2"})
    @DisplayName("Успешный выбор адреса")
    void selectionAddress (String address){
        modal.openPage().setAddress(address).clickSubmitButton();
        header.checkAddress(address);
    }


}
