package app.coolweather.com.coolweather.util;

/**
 * Created by 10483 on 2016/11/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
