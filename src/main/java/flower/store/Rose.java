package flower.store;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rose extends Flower {
    public static final double SEPAL_LENGTH_ROSE = 4.1;
    public static final int PRICE_ROSE = 14;

    public Rose() {
        super(FlowerColor.RED, FlowerType.ROSE,
                SEPAL_LENGTH_ROSE, PRICE_ROSE);
    }
}