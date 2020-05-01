package com.mandoo.aosannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_frame)
public class FrameActivity extends AppCompatActivity {

    @ViewById(R.id.imageView)
    ImageView imageView;

    @ViewById(R.id.imageView2)
    ImageView imageView2;

    int index = 0;

    @Click
    void imageChangeBtn(){

        if(index == 0 ){
            index = 1;
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        }else {
            index = 0;
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }

    }
}

