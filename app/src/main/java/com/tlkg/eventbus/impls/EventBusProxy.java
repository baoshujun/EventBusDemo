package com.tlkg.eventbus.impls;

import com.tlkg.eventbus.IEventBus;


public class EventBusProxy implements IEventBus {

    private IEventBus defaultEventBus;


    public void setDefaultEventBus(IEventBus defaultEventBus) {
        this.defaultEventBus = defaultEventBus;
    }

    public EventBusProxy() {
    }

    public EventBusProxy(IEventBus defaultEventBus) {
        this.defaultEventBus = defaultEventBus;
    }

    public   void register(Object subscriber) {
          if (defaultEventBus != null){
              defaultEventBus.register(subscriber);
          }
    }

    public   void unregister(Object subscriber) {
        if (defaultEventBus != null){
            defaultEventBus.unregister(subscriber);
        }
    }

    public   void sendEvent(Event event) {
        if (defaultEventBus != null){
            defaultEventBus.sendEvent(event);
        }
    }

    public   void sendStickyEvent(Event event) {
        if (defaultEventBus != null){
            defaultEventBus.sendStickyEvent(event);
        }
    }

    @Override
    public void installEventBusIndex() {
        if (defaultEventBus != null){
            defaultEventBus.installEventBusIndex();
        }
    }
}
