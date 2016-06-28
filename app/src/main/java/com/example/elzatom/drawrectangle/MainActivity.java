package com.example.elzatom.drawrectangle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DrawRectangle drawingRectangle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drawingRectangle = new DrawRectangle(this);
        setContentView(drawingRectangle);
    }
}
