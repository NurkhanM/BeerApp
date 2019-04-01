package com.md.nurkhan.beerapp.data.beers;

import com.md.nurkhan.beerapp.data.beers.local.IBeerLocalDataSource;
import com.md.nurkhan.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.List;

public class BeerRepository implements IBeersDataSource {

    private IBeerLocalDataSource mLocal;
    private IBeerRemoteDataSource mRemote;

    public BeerRepository(IBeerLocalDataSource local,
                          IBeerRemoteDataSource remote) {
        mLocal = local ;
        mRemote = remote ;
    }



    @Override
    public List<BeerEntity> getBeers() {
        //sds
        return  mLocal.loadBeers();
    }

    @Override
    public BeerEntity getBeer(int id) {
        return null;
    }
}
