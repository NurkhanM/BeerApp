package com.md.nurkhan.beerapp.data.beers;

import android.support.annotation.Nullable;

import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeersDataSource {

    void getBeers(BeerCallback collback);

    @Nullable
    BeerEntity getBeer(int id);

    interface BeerCallback{
        void onSuccess(List<BeerEntity> beers);
        void onFalture(String message);
    }


}
