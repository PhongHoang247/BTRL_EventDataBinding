package com.phong.btrl_eventdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.phong.btrl_eventdatabinding.databinding.ActivityMainBinding;
import com.phong.model.TemperatureData;

public class MainActivity extends AppCompatActivity implements MainActivityContact.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        MainActivityPresenter presenter = new MainActivityPresenter(MainActivity.this);
        TemperatureData temperatureData = new TemperatureData("100");
        binding.setPresenter(presenter);
        binding.setTemp(temperatureData);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        Toast.makeText(MainActivity.this,temperatureData.getCelsius(),Toast.LENGTH_SHORT).show();
    }
}
