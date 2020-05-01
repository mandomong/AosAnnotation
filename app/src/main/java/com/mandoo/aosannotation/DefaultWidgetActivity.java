package com.mandoo.aosannotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class DefaultWidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_widget);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        boolean checked = radioButton.isChecked();


    }
}
