package taximeter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TaxiMeterTest {

    private TaxiMeter taxiMeter;

    @BeforeEach
    void setUp() {
        taxiMeter = new TaxiMeter();
    }

    @Test
    void should_charge_6_yuan_given_1_miles_and_0_minute() {
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

    @Test
    void should_charge_13_yuan_given_2_miles_and_3_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        Integer charge = taxiMeter.charge(2, 3);
        assertThat(charge).isEqualTo(7);
    }


}
