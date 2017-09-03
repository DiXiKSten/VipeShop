package ru.dix.vipeshop.goods.atomizers;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.dix.vipeshop.R;
import ru.dix.vipeshop.goods.GoodsCategoriesAdapter;
import ru.dix.vipeshop.goods.mods.Mods;

/**
 * A simple {@link Fragment} subclass.
 */
public class AtomizerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView goodsCategoriesRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_goods_categories, container, false);
        String[] goodsCategories = new String[Atomizer.atomizers.length];
        for (int i = 0; i < goodsCategories.length; i++) {
            goodsCategories[i] = Atomizer.atomizers[i].getName();
        }
        int[] ctegoriesImages = new int[Atomizer.atomizers.length];
        for (int i = 0; i < ctegoriesImages.length; i++) {
            ctegoriesImages[i] = Atomizer.atomizers[i].getImageResourceId();
        }
        GoodsCategoriesAdapter adapter = new GoodsCategoriesAdapter(goodsCategories, ctegoriesImages);
        goodsCategoriesRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        goodsCategoriesRecycler.setLayoutManager(layoutManager);
        return goodsCategoriesRecycler;
    }
}
