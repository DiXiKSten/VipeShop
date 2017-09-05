package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 03.09.2017.
 */

public class Chargers extends BaseGoods {

    public static final Chargers[] chargerses = {
            new Chargers("Зарядные устройства", R.drawable.charge_station),
            new Chargers("Аккумуляторы", R.drawable.akkums)
    };

    private Chargers(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
