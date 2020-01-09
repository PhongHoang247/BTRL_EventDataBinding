package com.phong.btrl_eventdatabinding;

import com.phong.model.TemperatureData;

public interface MainActivityContact {
    public interface Presenter{
        void onShowData(TemperatureData temperatureData);
    }
    public interface View{
        void showData(TemperatureData temperatureData);
    }
}
