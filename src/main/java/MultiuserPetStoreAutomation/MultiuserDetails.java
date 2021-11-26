// Multiuser Array Api Automation for Pet Store

package MultiuserPetStoreAutomation;

import PetStroreApiAutomation.ResponseUser;
import PetStroreApiAutomation.UserDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiuserDetails {
 // Creating class object
    UserDetail[] userDetails;
// setting up the values of users
    @BeforeEach
    public void setup() {
        userDetails = new UserDetail[2];
        userDetails[0] = new UserDetail();
        userDetails[0].setId("1");
        userDetails[0].setUserName("RajDeep");
        userDetails[0].setFirstName("Manasvi");
        userDetails[0].setLastName("Seshan");
        userDetails[0].setEmail("testmail@test.com");
        userDetails[0].setPassword("123456");
        userDetails[0].setPhonenum("987654321");
        userDetails[0].setUserStatus("1");

        userDetails[1] = new UserDetail();
        userDetails[1].setId("1");
        userDetails[1].setUserName("RajDeep2");
        userDetails[1].setFirstName("Manu");
        userDetails[1].setLastName("Seshan");
        userDetails[1].setEmail("testmail@test.com");
        userDetails[1].setPassword("123456");
        userDetails[1].setPhonenum("987654321");
        userDetails[1].setUserStatus("1");
    }
// Method to post UserDetails and check response
    @Test
    public void postingMultiUserDetails() {
        Response response =

                given().
                        contentType(ContentType.JSON).
                        body(userDetails).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user/createWithArray").
                        then().
                        assertThat().
                        statusCode(200).
                        extract().response();


    }
    // test to check the obtained response
    @Test
    public void checkingResponse() {
        ResponseUser responseUserDetail=
                given().contentType(ContentType.JSON).
                        body(userDetails).
                        when().
                        post("https://petstore.swagger.io/v2/user").
                        as(ResponseUser.class);

        assertEquals(responseUserDetail.getCode(),"200");
        System.out.println(responseUserDetail);
    }

}
