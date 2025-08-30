package rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TestCase {
    @Test
    public void test1() {
      given().baseUri("https://68b2ef7cc28940c9e69dbd03.mockapi.io")
            .when().get("/api/v1/users")
        .then().log().all()
        .assertThat().statusCode(200)
              .assertThat().body("[0]", hasValue("Peru"));
              //.assertThat().body("[0].name", equalTo("Frank Schroeder"));
              //.assertThat().body("name",hasItem("Cora Hammes"));
             // .assertThat().body("name",hasItems("Cora Hammes","Ruby Donnelly"));
              //.assertThat().body("name", contains("Cora Hammes"));
             // .assertThat().body("name",containsInAnyOrder("Cora Hammes","Ruby Donnelly"));
             // .assertThat().body("name",empty());
             // .assertThat().body("name",is(not(empty())))
            //.assertThat().body("name", hasSize(24));
        //.assertThat().body("name.size()", equalTo(24));
        //.assertThat().body("createdAt", everyItem(startsWith("2025")));
        //.assertThat().body("[0]", hasKey("id"));
       // .assertThat().body("[0]", not(hasKey("gwafah")));
        //.assertThat().body("[0]", hasValue("Peru"));
        //.assertThat().body("[0]", hasEntry("name","Frank Schroeder"));
    }
}
