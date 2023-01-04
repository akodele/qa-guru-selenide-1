package qa.guru;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsTest {

    SelenideElement tabWiki=$x("//a[@id='wiki-tab']"),
                    moreLink=$x("//button[contains(., 'more pages')]"),
                    softAssertionsText=$x("//*[@id='wiki-pages-box']"),
                    softAssertionsLink=$x("//a[contains(., 'SoftAssertions')]"),
                    example=$x("//div[@id='wiki-content']");


    @DisplayName("Домашняя работа по QA Guru/Selenide 1")
    @Test
    public void test(){

        open("https://github.com/selenide/selenide");

        tabWiki.click();
        moreLink.click();
        softAssertionsText.shouldHave(text("SoftAssertions"));
        softAssertionsLink.click();
        example.shouldHave(text("Using JUnit5 extend test class"));
    }
}
