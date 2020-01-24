package com.example.playingusingmultitouch;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MyFirstPingPongSurfaceView  extends SurfaceView implements SurfaceHolder.Callback {

    // Initial values

    // The thread
    private PingPongThread pingPongTread = null; // falt
    // The ball
    private int x; private int y;
    // The speed and other attributes
    private int xDirection = 10; private int yDirection = 10;
    private static int radius = 20; private static int ballColor = Color.BLUE;
    // To two palettes
    public float meitatX; boolean clicPartEsquerre;
    private float distanciaX = 100, distanciaY = 10;
    private float ample = 10, alt = 150;
    private float paleta1X , paleta1Y, paleta2X, paleta2Y; // To manage palettes
    private float mLastTouchX, mLastTouchY;
    // The Paint objects
    Paint table = new Paint(); Paint ball = new Paint();
    Paint paleta1 = new Paint(); Paint paleta2 = new Paint();
    // The constructor
    public MyFirstPingPongSurfaceView(Context context) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    // The inner thread class
    private class MyAnimationThread extends Thread {
        private SurfaceHolder surfaceHolder;

        // Constructor
        public MyAnimationThread(SurfaceHolder surfaceHolder) {
            this.surfaceHolder = surfaceHolder;
        }

        public void run() { // Thread operations }
        }
    }
}