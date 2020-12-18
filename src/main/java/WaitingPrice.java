import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class WaitingPrice {
    private static final BigDecimal WAITING_PRICE_RATE = valueOf(0.25d);
    private TotalPrice totalPrice;

    public WaitingPrice(TotalPrice totalPrice) {

        this.totalPrice = totalPrice;
    }

    void calculateWaitingMinutesPrice(int minutes) {
        totalPrice.add(waitingPrice(minutes));
    }

    private BigDecimal waitingPrice(int minutes) {
        return valueOf(minutes).multiply(WAITING_PRICE_RATE);
    }

}
