package Web.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTests {


    @Test
    void testAuth() {
        open("http://client-login.stage.gboteam.ru");
        $("[name=login]").setValue("testuser99");
        $("[type=password]").setValue("12345678gG!");
        $("[type=submit]").click();
        $("[name=code]").setValue("111111");
        $("[type=submit]").click();
    }
}
