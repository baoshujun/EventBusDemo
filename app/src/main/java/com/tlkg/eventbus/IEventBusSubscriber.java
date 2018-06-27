package com.tlkg.eventbus;

import com.tlkg.eventbus.impls.Event;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public interface IEventBusSubscriber {


    public void onMainEvent(Event event);


    public void onStickyEventBusCome(Event event);
}
