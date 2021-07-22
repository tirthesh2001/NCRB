package com.example.ncrb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Police_Login_Page extends AppCompatActivity {

    Button police_login;
    EditText police_id, police_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_login_page);

        police_login = findViewById(R.id.btn_Police_Login);
        police_id = findViewById(R.id.police_id);
        police_pass = findViewById(R.id.police_pass);

        police_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Police_Login_Page.this, police_nav.class));
            }
        });
    }
}