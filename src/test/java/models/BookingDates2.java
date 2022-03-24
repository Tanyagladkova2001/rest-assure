package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class BookingDates2 {

        @SerializedName("checkin")
        @Expose
        @Builder.Default
        public String checkin = "2021-12-21";

        @SerializedName("checkout")
        @Expose
        @Builder.Default
        public String checkout = "2021-01-20";

}
