package com.md.nurkhan.beerapp.data.beers.remote;

import com.md.nurkhan.beerapp.data.beers.IBeersDataSource;
import com.md.nurkhan.beerapp.model.BeerEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class BeerRemoteDataSours implements IBeerRemoteDataSource {

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.punkapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private BeerNetworkClient client = retrofit.create(BeerNetworkClient.class);

    @Override
    public void getBeers(final IBeersDataSource.BeerCallback beerCallback) {
        Call<List<BeerEntity>> call = client.getBeers(50);

        call.enqueue(new Callback<List<BeerEntity>>() {
            @Override
            public void onResponse(Call<List<BeerEntity>> call, Response<List<BeerEntity>> response) {
                if (response.isSuccessful()){
                    if (response.body() != null){
                        beerCallback.onSuccess(response.body());
                    }else {
                        beerCallback.onFalture("Bode is empty");
                    }
                }else {
                    beerCallback.onFalture("Responce code = " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<BeerEntity>> call, Throwable t) {
                beerCallback.onFalture(t.getMessage());
            }
        });
    }

    private interface BeerNetworkClient {
        @GET("v2/beers")
        Call<List<BeerEntity>> getBeers(@Query("per_page") int perPage);
    }
}
