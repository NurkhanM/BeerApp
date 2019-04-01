package com.md.nurkhan.beerapp.data.beers;

import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeersDataSource {

    List<BeerEntity> getBeers();

    BeerEntity getBeer(int id);

    interface BeerCallback{
        void onSuccess(List<BeerEntity> beers);
        void onFalture(String message);
    }


}
