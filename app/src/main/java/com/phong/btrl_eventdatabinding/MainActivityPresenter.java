package com.phong.btrl_eventdatabinding;

import com.phong.model.TemperatureData;

public class MainActivityPresenter {
    private MainActivityContact.View view;
    public MainActivityPresenter(MainActivityContact.View view){
        this.view = view;
    }
    public void onShowData(TemperatureData temperatureData){
        this.view.showData(temperatureData);
    }
}
