package com.shujun.bao.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tlkg.eventbus.IEventBusSubscriber;
import com.tlkg.eventbus.impls.Event;

public class MainActivity extends AppCompatActivity implements IEventBusSubscriber{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onMainEvent(Event event) {

    }

    @Override
    public void onStickyEventBusCome(Event event) {

    }
}
