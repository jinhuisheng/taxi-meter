import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaxiMeterTest {
    @Test
    void should_calculate_price_be_6_given_1_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        assertThat(taxiMeter.calculate(1, 0)).isEqualTo(6);
    }

    @Test
    void should_calculate_price_be_7_given_3_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        assertThat(taxiMeter.calculate(3, 0)).isEqualTo(7);
    }

    @Test
    void should_calculate_price_be_13_given_10_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        assertThat(taxiMeter.calculate(10, 0)).isEqualTo(13);
    }

    @Test
    void should_calculate_price_be_7_given_2_miles_and_3_minute() {
        TaxiMeter taxiMeter = new TaxiMeter();
        assertThat(taxiMeter.calculate(2, 3)).isEqualTo(7);
    }


}
