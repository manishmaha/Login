package com.example.crazziee.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText et_Username, et_password;
    private String Username, Password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Username = (EditText) findViewById(R.id.Username);
        et_password = (EditText) findViewById(R.id.Password);
        btn_login = (Button) findViewById(R.id.btnlogin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login() {
        Username = et_Username.getText().toString().trim();
        Password = et_password.getText().toString().trim();
        if (!validate()) {
            Toast.makeText(this, "invalid name", Toast.LENGTH_SHORT).show();
        } else {
            onSignupSuccess();
        }
    }

    public void onSignupSuccess() {
        //TODO what will go after the valid input
    }

    public boolean validate() {
        boolean valid = true;
        if (Password.isEmpty() || Username.isEmpty()) {
            Toast.makeText(this, "invalid", Toast.LENGTH_SHORT).show();
            valid = false;
        }
        return valid;
    }
}