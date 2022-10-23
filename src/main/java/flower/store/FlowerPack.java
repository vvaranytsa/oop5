package flower.store;

import flower.store.Flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class FlowerPack {
    @Getter @Setter
    private Flower flower;
    @Getter @Setter
    private int amount;

    public double getPrice(){
        return flower.getPrice() * amount;
    }
}