package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class dangnhap extends AppCompatActivity {

    Button CallCreate,CallLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dangnhap);

        //Hooks
        CallCreate = findViewById(R.id.CallCreate);
        CallLogin = findViewById(R.id.CallLogin);

        CallCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this,CreateAccount.class);
                startActivity(intent);
            }
         });

       CallLogin.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
            Intent intent = new Intent(dangnhap.this, userinfo.class);
                startActivity(intent);
            }
       });

    };
};