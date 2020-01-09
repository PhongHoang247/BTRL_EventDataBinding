package com.phong.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.phong.btrl_eventdatabinding.BR;



public class TemperatureData extends BaseObservable {
    private String celsius;
    private String fahrenheit;

    public TemperatureData() {
    }

    public TemperatureData(String celsius, String fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }
    @Bindable
    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR._all);
    }
    @Bindable
    public String getFahrenheit() {
        return fahrenheit;
    }
    @Bindable
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
