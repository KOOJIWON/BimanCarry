package com.example.apple.bimancarry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this,SplashActivity.class));
    }

    public void btnChicken(View v){
        Intent intent = new Intent(MainActivity.this,ChickenActivity.class);
        startActivity(intent);
    }

    public void btnPizza(View v){
        Intent intent = new Intent(MainActivity.this,PizzaActivity.class);
        startActivity(intent);
    }

    public void btnHambuger(View v){
        Intent intent = new Intent(MainActivity.this,HambugerActivity.class);
        startActivity(intent);
    }


}
