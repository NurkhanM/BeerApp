package com.md.nurkhan.beerapp.presentetion.beerdetails;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.md.nurkhan.beerapp.R;

public class BeerDetailsActivity extends AppCompatActivity implements IBeerDetailsContract.View {

    private static String EXTRA_ID = "beers_id";

    public static void start(Context context, int id){
        context.startActivity(new Intent());
    }


    private IBeerDetailsContract.Presenter mPresenter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_details);

        mPresenter = new BeerDetailsPresenter();

        mPresenter.attachView(this);

        getIntent().getIntExtra(EXTRA_ID, -1);

    }

    @Override
    public void attachPresenter(IBeerDetailsContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}
