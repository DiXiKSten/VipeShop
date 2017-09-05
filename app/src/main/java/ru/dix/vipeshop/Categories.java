package ru.dix.vipeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ru.dix.vipeshop.goods.Acsess;
import ru.dix.vipeshop.goods.BaseGoods;
import ru.dix.vipeshop.goods.Chargers;
import ru.dix.vipeshop.goods.GoodsCategoriesAdapter;
import ru.dix.vipeshop.goods.Atomizer;
import ru.dix.vipeshop.goods.Liquids;
import ru.dix.vipeshop.goods.Mods;
import ru.dix.vipeshop.goods.Sets;

public class Categories extends AppCompatActivity {
    private RecyclerView goodsCategoriesRecycler;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] goodsCategories;
    private int[] ctegoriesImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Intent intent = getIntent();
        String categories = intent.getStringExtra("categories");
        setContnet(categories);
        goodsCategoriesRecycler = (RecyclerView) findViewById(R.id.goods_categories);
        mLayoutManager = new LinearLayoutManager(this);
        goodsCategoriesRecycler.setLayoutManager(mLayoutManager);
        GoodsCategoriesAdapter adapter = new GoodsCategoriesAdapter(goodsCategories, ctegoriesImages);
        goodsCategoriesRecycler.setAdapter(adapter);
    }

    private void setContnet(String categories) {
        switch (categories) {
            case "mods":
                fillCategiories(Mods.mods);
                break;
            case "atomizers":
                fillCategiories(Atomizer.atomizers);
                break;
            case "liquids":
                fillCategiories(Liquids.liquidses);
                break;
            case "chargers":
                fillCategiories(Chargers.chargerses);
                break;
            case "acsess":
                fillCategiories(Acsess.acsesses);
                break;
            case "sets":
                fillCategiories(Sets.setses);
                break;
            case "favorits":
                ;
                break;
        }
    }

    private void fillCategiories(BaseGoods[] baseGoodses) {
        goodsCategories = new String[baseGoodses.length];
        ctegoriesImages = new int[baseGoodses.length];
        for (int i = 0; i < goodsCategories.length; i++) {
            goodsCategories[i] = baseGoodses[i].getName();
        }
        for (int i = 0; i < ctegoriesImages.length; i++) {
            ctegoriesImages[i] = baseGoodses[i].getImageResourceId();
        }
    }
    // Верхняя менюшка при создании
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Верхняя менюшка при нажатии
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_buy) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
