package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Flower {

    @Setter
    private FlowerColor color;
    @Getter
    @Setter
    private FlowerType flowerType;
    @Getter
    @Setter
    private double sepalLength;
    @Getter
    @Setter
    private double price;

    public Flower() {

    }

    public String getColor() {
        return color.toString();
    }


}