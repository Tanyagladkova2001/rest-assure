package models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking2 {

    @Builder.Default
    public String firstname = "Susan";
    @Builder.Default
    public String lastname = "Ericsson";

    @SerializedName("totalprice")
    @Builder.Default
    public int totalPrice = 688;
    @SerializedName("depositpaid")
    @Builder.Default
    public boolean depositPaid = false;
    @Builder.Default
    public BookingDates2 bookingdates = new BookingDates2();
    @SerializedName("additionalneeds")
    @Builder.Default
    public String additionalNeeds = "Breakfast";

}
