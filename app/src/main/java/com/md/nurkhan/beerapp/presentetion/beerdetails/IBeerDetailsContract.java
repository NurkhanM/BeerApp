package com.md.nurkhan.beerapp.presentetion.beerdetails;

import com.md.nurkhan.core.CoreMvpContract;

public interface IBeerDetailsContract {
    interface View  extends CoreMvpContract.View<Presenter> {


    }

    interface Presenter  extends CoreMvpContract.Presenter<View> {


    }
}
