package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 03.09.2017.
 */

public class Atomizer extends BaseGoods {

    public static final Atomizer[] atomizers = {
            new Atomizer("Баки", R.drawable.baks),
            new Atomizer("Дрипки", R.drawable.drips)
    };

    private Atomizer(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
