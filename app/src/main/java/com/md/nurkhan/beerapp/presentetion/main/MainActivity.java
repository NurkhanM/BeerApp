package com.md.nurkhan.beerapp.presentetion.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.md.nurkhan.beerapp.BeerApp;
import com.md.nurkhan.beerapp.data.beers.IBeersDataSource;
import com.md.nurkhan.beerapp.data.beers.remote.BeerRemoteDataSours;
import com.md.nurkhan.beerapp.model.BeerEntity;
import com.md.nurkhan.beerapp.presentetion.beers.BeersFragment;
import com.md.nurkhan.beerapp.presentetion.beers.BeersPresenter;
import com.md.nurkhan.beerapp.presentetion.beers.IBeersContract;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragment).commit();

        mPresenter = new BeersPresenter(BeerApp.beerRepository);

        mPresenter.attachView(fragment);

        new BeerRemoteDataSours().getBeers(new IBeersDataSource.BeerCallback() {
            @Override
            public void onSuccess(List<BeerEntity> beers) {

            }

            @Override
            public void onFalture(String message) {

            }
        });


    }
}
