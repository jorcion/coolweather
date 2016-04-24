package com.coolweather.app.util;

/**
 * Created by zoc on 2016/4/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
