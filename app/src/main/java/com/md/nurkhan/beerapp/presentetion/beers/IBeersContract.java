package com.md.nurkhan.beerapp.presentetion.beers;

import com.md.nurkhan.beerapp.model.BeerEntity;
import com.md.nurkhan.core.CoreMvpContract;

import java.util.ArrayList;

public interface IBeersContract {

    interface View extends CoreMvpContract.View<Presenter> {

        void showBeers(ArrayList<BeerEntity> beer);

        void openBeerDetails(int id);

    }

    interface Presenter extends CoreMvpContract.Presenter<View>{

        void onBeerClick(int possition);

        void getBeers();

    }

}
