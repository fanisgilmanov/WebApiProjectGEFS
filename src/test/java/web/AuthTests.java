package web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTests {
    @BeforeAll
    static void beforeUrl() {
        Configuration.baseUrl = "http://client-login.stage.gboteam.ru";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void testAuth() {
        open(baseUrl);
        $("[name=login]").setValue("testuser99");
        $("[type=password]").setValue("12345678gG!");
        $("[type=submit]").click();
        $("[name=code]").shouldBe(visible, Duration.ofSeconds(10)).setValue("111111");
        $("[type=submit]").click();
    }
}
