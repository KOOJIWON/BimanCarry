package com.example.apple.bimancarry;


import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class SplashActivity extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler(){
            public void handleMessage(Message msg){
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0,2000);
    }

}
