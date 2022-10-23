package flower.store;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tulip extends Flower {

    public static final double SEPAL_LENGTH_TULIP = 4.1;
    public static final int PRICE_TULIP = 14;

    public Tulip() {
        super(FlowerColor.BLUE, FlowerType.TULIP, SEPAL_LENGTH_TULIP,
                PRICE_TULIP);
    }
}