package ru.netology.service;

import io.restassured.response.ValidatableResponseOptions;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Test3 {

    @Test
    void shouldReturnBody() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("same date", is(true))
        ;
    }
}
