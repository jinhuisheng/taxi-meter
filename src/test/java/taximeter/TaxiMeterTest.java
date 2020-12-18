package taximeter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TaxiMeterTest {
    @Test
    void should_charge_6_yuan_given_1_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        Integer charge = taxiMeter.charge(1, 0);
        assertThat(charge).isEqualTo(6);
    }

    @Test
    void should_charge_7_yuan_given_3_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        Integer charge = taxiMeter.charge(3, 0);
        assertThat(charge).isEqualTo(7);
    }

    @Test
    void should_charge_13_yuan_given_10_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        Integer charge = taxiMeter.charge(10, 0);
        assertThat(charge).isEqualTo(13);
    }


}
