package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Chalomile extends Flower {
    public static final double SEPAL_LENGTH_CHALOMILE = 4.1;
    public static final int PRICE_CHALOMILE = 7;

    public Chalomile() {
        super(FlowerColor.GREEN, FlowerType.CHAMOMILE,
                SEPAL_LENGTH_CHALOMILE, PRICE_CHALOMILE);
    }
}