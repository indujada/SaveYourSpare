package com.dbs.hack2hire.saveyourspare.presenter;

import android.view.View;

import com.dbs.hack2hire.saveyourspare.model.LoginResponse;

public class DashboardPresenter {
    private LoginResponse loginResponse;
    private DashboardView view;

    DashboardPresenter(DashboardView view){
        this.view = view;
        this.loginResponse = new LoginResponse();
    }

    public void getMainAccountBalance(){
        String bal = loginResponse.getResult();
        view.updateMainAccountBalance(bal);
    }

    public void getSpareChangeSavingBalance(){
        String bal = loginResponse.getResult();
        view.updateSpareChangeSavingBalance(bal);
    }

    public interface DashboardView{
        void updateMainAccountBalance(String bal);
        void updateSpareChangeSavingBalance(String bal);
    }
}
