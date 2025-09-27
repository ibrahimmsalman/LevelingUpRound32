package junitTestsPackage;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTests {

    @Test
    public void test1(){
        // my endpoint: https://catfact.ninja/breeds
        // request type: get
        // response code: 200

        var response = when()
                .get("https://catfact.ninja/breeds");

        var body = response.body().prettyPrint();

        response
                .then()
                .statusCode(200)
                .body("data.breed", hasItems("Abyssinian", "Bengal", "Chausie"));

    }
}
