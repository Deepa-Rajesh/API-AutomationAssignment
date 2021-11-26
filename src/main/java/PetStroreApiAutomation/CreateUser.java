// Api Automation of PetStore

package PetStroreApiAutomation;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CreateUser {
    UserDetail userDetail;

//method to set up user details
    @BeforeEach
    public void setupUserDetails(){
        userDetail = new UserDetail();
        userDetail.setId("5");
        userDetail.setUserName("Test_user");
        userDetail.setFirstName("HariPriyan");
        userDetail.setLastName("Rajesh");
        userDetail.setEmail("hari@testmail.com");
        userDetail.setPassword("abcdef");
        userDetail.setPhonenum("95674389");
        userDetail.setUserStatus("3");

    }
// test to post the user details
    @Test
    public void postingUserDetails() {
        Response  response =
                given().
                        contentType(ContentType.JSON).
                        body(userDetail).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user").
                        then().
                        assertThat().
                        statusCode(200).
                        extract().response();

        System.out.println("Response is : " + response.asPrettyString());
    }
// test to check the obtained response
   @Test
    public void checkingResponse() {
      ResponseUser responseUserDetail=
               given().contentType(ContentType.JSON).
                       body(userDetail).
                       when().
                       post("https://petstore.swagger.io/v2/user").
                       as(ResponseUser.class);

       assertEquals(responseUserDetail.getCode(),"200");
       System.out.println(responseUserDetail);
   }



}
