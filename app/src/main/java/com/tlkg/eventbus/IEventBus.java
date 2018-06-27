package com.tlkg.eventbus;

import com.tlkg.eventbus.impls.Event;

public interface IEventBus {

    public  void register(Object subscriber);

    public  void unregister(Object subscriber);

    public  void sendEvent(Event event);

    public  void sendStickyEvent(Event event);

    public void installEventBusIndex();

}
