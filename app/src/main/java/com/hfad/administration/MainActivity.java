package com.hfad.administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void InfoClick(View view) {
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }

    public void VhodClick(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}
