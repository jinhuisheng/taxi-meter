import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class WaitingPrice {
    private TotalPrice totalPrice;

    public WaitingPrice(TotalPrice totalPrice) {

        this.totalPrice = totalPrice;
    }

    void calculateWaitingMinutesPrice(int minutes) {
        totalPrice.add(waitingPrice(minutes));
    }

    private BigDecimal waitingPrice(int minutes) {
        return valueOf(minutes).multiply(valueOf(0.25d));
    }

}
