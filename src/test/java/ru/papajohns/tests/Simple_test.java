package ru.papajohns.tests;

import org.junit.jupiter.api.Test;
import ru.papajohns.pages.LocationModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Simple_test extends TestBase {

    LocationModal modal = new LocationModal();

    @Test
    public void firsttest(){
        //modal.openPage().clickSubmitButton();
        modal.openPage().setAddress("Никольская");
        sleep(2000);


        $(".AddressButton").shouldHave(text("700"));

        sleep(1000);
    }

}
