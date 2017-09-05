package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 05.09.2017.
 */

public class Liquids extends BaseGoods {

    public static final Liquids[] liquidses = {
            new Liquids("Основа", R.drawable.base),
            new Liquids("Ароматизатор", R.drawable.aroma),
            new Liquids("Готовые жидкости", R.drawable.jija)
    };

    private Liquids(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}

