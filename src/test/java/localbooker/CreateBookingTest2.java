package localbooker;

import models.Booking2;
import org.testng.annotations.Test;

import static constants.Endpoints.BOOKING_ID_URN_PATTERN;
import static constants.Endpoints.BOOKING_URN;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateBookingTest2 extends BaseTest{
    public static final String BOOKING_PATH = "booking";

    @Test
    public void CreateBookingTest2(){
        Booking2 createdBooking = given()
                .spec(requestSpec)
                .body(new Booking2())
         .when()
                .log().body()
                .post(BOOKING_URN)
          .then()
                .log().body()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getObject(BOOKING_PATH, Booking2.class);
        assertThat(createdBooking, equalTo(new Booking2()));
    }
}
