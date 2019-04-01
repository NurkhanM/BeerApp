package com.md.nurkhan.beerapp;

import android.app.Application;
import android.util.Log;

import com.md.nurkhan.beerapp.data.beers.BeerRepository;
import com.md.nurkhan.beerapp.data.beers.IBeersDataSource;
import com.md.nurkhan.beerapp.data.beers.local.BeerLocalDataSource;

public class BeerApp extends Application {

        public static IBeersDataSource beerRepository;

        @Override
        public void onCreate() {
            super.onCreate();

            beerRepository = new BeerRepository(
                    new BeerLocalDataSource(),
                    null
            );

            Log.d("ololo", "On application create");
        }

}
