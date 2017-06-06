package com.example.tufengchao.mvpdemo;

/**
 * Created by tufengchao on 2017/6/5.
 */

public interface Listener<T> {
    void success(T t);
    void error(Exception ex);
}
