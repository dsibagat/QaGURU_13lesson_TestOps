package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("Main page content")
@Tag("web")
@Story("Some story")
public class MainPageWithStoryTests extends TestBase {

    @Test
    @DisplayName("Check sub-items in submenu \"ABOUT US\" with story")
    void submenuAboutUsIsShownTestWithStory() {
        step("Open main page", () ->
                open(""));

        step("Open submenu \"ABOUT US\"", () ->
                $(".menu-icon-132").hover());

        step("Check that submenu is shown", () ->
                $(".open").shouldHave(
                        text("Management"),
                        text("Awards"),
                        text("Careers"),
                        text("News"),
                        text("Contact")));
    }
}