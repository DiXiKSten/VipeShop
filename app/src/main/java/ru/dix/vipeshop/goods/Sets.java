package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 03.09.2017.
 */

public class Sets extends BaseGoods {

    public static final Sets[] setses = {
            new Sets("ПОКА ЧТО ТАКАЯ СТРАНИЦА", R.drawable.sets)
    };

    private Sets(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
