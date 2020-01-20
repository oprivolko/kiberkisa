package my_masterpieces.APITest;

import entity.Department;
import entity.Organization;
import entity.RequestObject;
import entity.RequestTokenObject;
import io.restassured.authentication.OAuthSignature;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateMappingTest {
    @Test
    public void createMapping() {
        Organization org = new Organization("ORG1", 1);
        Department dpt = new Department("DPT1", 11);
        String token = getToken();
        String mappingId = "123";
        RequestObject request = new RequestObject("ORG1", 1, 11);

        String response = given()
                .spec(getRequestSpec())
                .auth()
                .oauth2("Strsdfsdf", OAuthSignature.HEADER)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri("https://blabla.com/")
                .body(request)
                .patch("/org/dpt/map")


                .then()
                .spec(getResponseSpec())
                .statusCode(200)
                .body("data.orgId", Matchers.equalTo(org.getId()))
                .body("data.mappingId", Matchers.equalTo(mappingId))
                .body("data.dptId", Matchers.equalTo(dpt.getId()))
                .extract()
                .asString();
        System.out.println(request);
    }

    private String getToken(){
        RequestTokenObject tokenObject = new RequestTokenObject("superuser", "traverse", "y9JaZSGUWmlMeHLl", "password", "VSA", "version=1.0 vsa-integration-setup vsa-mappings refreshToken");
        String tokenResponse = given()
                .auth()
                .oauth2("Strsdfsdf", OAuthSignature.HEADER)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri("https://blabla.com")
                .body(tokenObject)
                .post("/token")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        return tokenResponse;
    }

    protected RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .addCookie("token", "moderntoken")
                .addHeader("header1", "value1")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.ANY)
                .build();
    }

    protected ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine("Status OK")
                .build();
    }


}

