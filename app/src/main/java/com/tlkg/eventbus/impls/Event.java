package com.tlkg.eventbus.impls;

 /**
   *
   * decreption: 事件实体类，包含事件代号和事件实体
   *
   * created by  @auther bao.shujun on the 2018/6/27 下午11:26
   *
   * modify:
   *
   */
public class Event<T> {
    private int code;
    private T data;

    public Event(int code) {
        this.code = code;
    }

    public Event(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
