package com.mandoo.aosannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.myInput)
    EditText myInput;

    @ViewById(R.id.myTextView)
    TextView textView;

    @Click
    void myButton() {
        String name = myInput.getText().toString();
        textView.setText("Hello "+name);
    }


    @Click
    void linearBtn() {
        Intent intent = new Intent(getApplicationContext(), LinearActivity.class);
        startActivity(intent);
    }

    @Click
    void relativeBtn() {
        Intent intent = new Intent(getApplicationContext(), RelativeActivity.class);
        startActivity(intent);
    }

    @Click
    void frameBtn(){
        Intent intent = new Intent(getApplicationContext(), FrameActivity.class);
        startActivity(intent);
    }

}