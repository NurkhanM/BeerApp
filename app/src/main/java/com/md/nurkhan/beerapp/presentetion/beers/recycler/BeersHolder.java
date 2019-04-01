package com.md.nurkhan.beerapp.presentetion.beers.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.md.nurkhan.beerapp.R;
import com.md.nurkhan.beerapp.model.BeerEntity;

public class BeersHolder extends RecyclerView.ViewHolder {

    private TextView textTitle;

    public BeersHolder(@NonNull View itemView) {
        super(itemView);

        textTitle = itemView.findViewById(R.id.txtBeersName);
    }

    void onBind(BeerEntity beerEntity){
        textTitle.setText(beerEntity.getName());
    }


}
