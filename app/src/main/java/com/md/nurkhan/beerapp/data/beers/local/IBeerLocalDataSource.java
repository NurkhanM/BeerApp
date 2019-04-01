package com.md.nurkhan.beerapp.data.beers.local;

import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerLocalDataSource {

    List<BeerEntity> loadBeers();
}
