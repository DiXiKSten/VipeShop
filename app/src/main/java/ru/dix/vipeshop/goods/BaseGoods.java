package ru.dix.vipeshop.goods;

/**
 * Created by DiX on 03.09.2017.
 */

public abstract class BaseGoods {
    private String name;
    private int imageResourceId;

    public BaseGoods(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
