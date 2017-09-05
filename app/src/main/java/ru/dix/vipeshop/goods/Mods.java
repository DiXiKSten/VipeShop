package ru.dix.vipeshop.goods;

import ru.dix.vipeshop.R;

/**
 * Created by DiX on 03.09.2017.
 */

public class Mods extends BaseGoods {

    public static final Mods[] mods = {
            new Mods("Мех моды", R.drawable.mech_mods),
            new Mods("Бокс моды", R.drawable.box_mods)
    };

    private Mods(String name, int imageResourceId) {
        super(name, imageResourceId);
    }
}
