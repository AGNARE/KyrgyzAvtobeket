package com.agn.fixbusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    MaterialButton login, register;
    ImageButton instogram;
    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initId();
        loginActivity();
        regisActivity();
        addInstogram();
    }

    private void addInstogram() {
        instogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/mtk.kg/reels/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.instagram.android");
                startActivity(intent);
//                try {
//                    startActivity(intent);
//                } catch (ActivityNotFoundException e){
//                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/mtk.kg/reels/")));
//                }
            }
        });
    }

    private void regisActivity() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = email.getText().toString();
                String textSecond = password.getText().toString();
                if (textSecond.isEmpty()) {
                    if (text.isEmpty()) {
                        Toast.makeText(RegisterActivity.this, "Зарегистрируйтесь пожалуйтса", Toast.LENGTH_SHORT+5).show();
                    } else {
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                } else {
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void loginActivity() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(this,);
            }
        });
    }

    private void initId() {
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        instogram = findViewById(R.id.instofram);
    }

}