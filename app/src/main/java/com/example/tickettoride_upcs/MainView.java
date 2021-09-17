package com.example.tickettoride_upcs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceView;

public class MainView extends SurfaceView {

    private Paint color;

    public MainView(Context context) {
        super(context);
        //enable drawing
        setWillNotDraw(false);

        //make paint
        color = new Paint();
        color.setARGB(255,255,0,0);

    }

    protected void onDraw(Canvas canvas){

        Bitmap image = BitmapFactory.decodeResource(getResources(),R.drawable.ticket_to_ride_background);
        canvas.drawBitmap(image, 200.f, 200.f, color);
    }
}
