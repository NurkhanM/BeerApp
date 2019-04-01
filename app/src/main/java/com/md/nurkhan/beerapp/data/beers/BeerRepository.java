package com.md.nurkhan.beerapp.data.beers;

import com.md.nurkhan.beerapp.data.beers.local.IBeerLocalDataSource;
import com.md.nurkhan.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.md.nurkhan.beerapp.model.BeerEntity;

public class BeerRepository implements IBeersDataSource {

    private IBeerLocalDataSource mLocal;
    private IBeerRemoteDataSource mRemote;

    public BeerRepository(IBeerLocalDataSource local,
                          IBeerRemoteDataSource remote) {
        mLocal = local ;
        mRemote = remote ;
    }


    @Override
    public void getBeers(BeerCallback collback) {

    }

    @Override
    public BeerEntity getBeer(int id) {
        return null;
    }
}
