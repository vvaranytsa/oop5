package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks;

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack i : flowerPacks)
            sum += i.getPrice();
        return sum;
    }

}