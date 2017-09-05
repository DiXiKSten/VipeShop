package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 03.09.2017.
 */

public class Acsess extends BaseGoods {

    public static final Acsess[] acsesses = {
            new Acsess("Инструменты", R.drawable.tools),
            new Acsess("Расходники", R.drawable.rashod)
    };

    private Acsess(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
