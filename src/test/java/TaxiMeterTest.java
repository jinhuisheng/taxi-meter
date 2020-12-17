import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaxiMeterTest {
    @Test
    void should_calculate_price_be_6_given_1_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter(1, 0);
        assertThat(taxiMeter.calculate()).isEqualTo(6);
    }

    @Test
    void should_calculate_price_be_7_given_3_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter(3, 0);
        assertThat(taxiMeter.calculate()).isEqualTo(7);
    }

    @Test
    void should_calculate_price_be_13_given_10_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter(10, 0);
        assertThat(taxiMeter.calculate()).isEqualTo(13);
    }

    @Test
    void should_calculate_price_be_7_given_2_miles_and_3_minute() {
        TaxiMeter taxiMeter = new TaxiMeter(2, 3);
        assertThat(taxiMeter.calculate()).isEqualTo(7);
    }


}
