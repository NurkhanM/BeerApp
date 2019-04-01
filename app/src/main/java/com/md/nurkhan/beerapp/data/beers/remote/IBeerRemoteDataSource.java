package com.md.nurkhan.beerapp.data.beers.remote;

import com.md.nurkhan.beerapp.data.beers.IBeersDataSource;

public interface IBeerRemoteDataSource {

    void getBeers(IBeersDataSource.BeerCallback beerCallback);


}
