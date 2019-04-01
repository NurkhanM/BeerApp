package com.md.nurkhan.beerapp.presentetion.beerdetails;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.md.nurkhan.beerapp.R;
import com.md.nurkhan.beerapp.model.BeerEntity;
import com.md.nurkhan.beerapp.presentetion.beers.IBeersContract;
import com.md.nurkhan.beerapp.presentetion.beers.recycler.BeersAdapter;

import java.util.ArrayList;

public class BeersDetailsFragment extends Fragment implements IBeersContract.View {

    private IBeersContract.Presenter mPresenter;

    private RecyclerView recyclerView;
    private BeersAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new BeersAdapter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beers, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.getBeers();
        }
    }

    @Override
    public void showBeers(ArrayList<BeerEntity> beer) {
        adapter.setListBeer(beer);
    }

    @Override
    public void openBeerDetails(int id) {

    }


    @Override
    public void attachPresenter(IBeersContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void finishView() {

    }
}
