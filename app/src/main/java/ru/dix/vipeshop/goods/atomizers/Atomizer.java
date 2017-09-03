package ru.dix.vipeshop.goods.atomizers;

import ru.dix.vipeshop.R;
import ru.dix.vipeshop.goods.BaseGoods;

/**
 * Created by DiX on 03.09.2017.
 */

public class Atomizer extends BaseGoods {

    public static final Atomizer[] atomizers = {
            new Atomizer("Баки", R.drawable.baks),
            new Atomizer("Дрипки", R.drawable.drips)
    };

    public Atomizer(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
