import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaxiMeterTest {
    @Test
    void should_calculate_price_be_6_given_1_miles_and_0_minute() {
        TaxiMeter taxiMeter = new TaxiMeter(1,0);
        assertThat(taxiMeter.calculate()).isEqualTo(6);
    }
}
