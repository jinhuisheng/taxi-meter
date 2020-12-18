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
}
