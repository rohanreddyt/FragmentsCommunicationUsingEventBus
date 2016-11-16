package com.rohan.user.fragmentscommunicationusingeventbus;

/**
 * Created by User on 11/16/2016.
 */

public class MyEvent {
    String info;

    public MyEvent(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
