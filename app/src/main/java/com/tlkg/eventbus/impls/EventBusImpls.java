package com.tlkg.eventbus.impls;

import com.tlkg.eventbus.IEventBus;

import org.greenrobot.eventbus.EventBus;

public class EventBusImpls implements IEventBus {

    @Override
    public  void register(Object subscriber) {
        EventBus.getDefault().register(subscriber);
    }

    @Override
    public  void unregister(Object subscriber) {
        EventBus.getDefault().unregister(subscriber);
    }
    @Override
    public  void sendEvent(Event event) {
        EventBus.getDefault().post(event);
    }

    @Override
    public  void sendStickyEvent(Event event) {
        EventBus.getDefault().postSticky(event);
    }

    @Override
    public void installEventBusIndex() {

    }
}
