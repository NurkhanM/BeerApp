package com.md.nurkhan.beerapp.presentetion.beers;

import com.md.nurkhan.beerapp.data.beers.IBeersDataSource;
import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.ArrayList;

public class BeersPresenter implements IBeersContract.Presenter {

    IBeersContract.View view;

    public BeersPresenter(IBeersDataSource beersDataSource) {
        beersDataSource.getBeers();
    }
    @Override
    public void onBeerClick(int possition) {

    }

    @Override
    public void getBeers() {
        ArrayList<BeerEntity> beers = new ArrayList<>();
        beers.add(new BeerEntity(0, "NUr", "", ""));
        beers.add(new BeerEntity(0, "NUr", "", ""));
        beers.add(new BeerEntity(0, "NUr", "", ""));
        beers.add(new BeerEntity(0, "NUr", "", ""));
        view.showBeers(beers);
        
    }

    @Override
    public void attachView(IBeersContract.View view) {
        this.view = view;
        view.attachPresenter(this);
    }

    @Override
    public void detachView() {

    }
}
