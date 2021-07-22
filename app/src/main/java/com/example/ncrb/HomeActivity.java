package com.example.ncrb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button police_log, commoner_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        police_log = findViewById(R.id.policeLogin);
        commoner_log = findViewById(R.id.commonerLogin);

        police_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(HomeActivity.this, Police_Login_Page.class);
                startActivity(i1);
            }
        });

        commoner_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(HomeActivity.this, Commoner_Login_Page.class);
                startActivity(i2);
            }
        });

    }

}