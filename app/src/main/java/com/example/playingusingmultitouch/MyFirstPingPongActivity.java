package com.example.playingusingmultitouch;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MyFirstPingPongActivity extends MainMenu {

    public MyFirstPingPongSurfaceView myFirstPingPongSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_ping_pong);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myFirstPingPongSurfaceView = new MyFirstPingPongSurfaceView(this);
        setContentView(myFirstPingPongSurfaceView);
    }
}
