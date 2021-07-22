package com.example.ncrb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Commoner_Login_Page extends AppCompatActivity {

    Button commoner_login;
    EditText commoner_name, commoner_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commoner_login_page);

        commoner_login = findViewById(R.id.btn_commoner_Login);
        commoner_name = findViewById(R.id.comm_name_edittxt);
        commoner_num = findViewById(R.id.comm_no_edittxt);

        commoner_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}