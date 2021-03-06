package com.example.a774261.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.graphics.Color;
import android.content.Intent;

public class Login extends AppCompatActivity {

    private EditText password;
    private EditText username;
    private Button btnSubmit;
    private String pwdSetting="1234";
    private String unSetting="person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        username = (EditText) findViewById(R.id.txtUsername);//save text in password
        password = (EditText) findViewById(R.id.txtPassword);//save text in password
        btnSubmit = (Button) findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new OnClickListener() { //puts a listener on the button

            @Override
            public void onClick(View v) {


                CheckInput();
            }

        });
    }

    public void CheckInput(){
        if(username.getText().toString().equals("person")&& password.getText().toString().equals("1234")){

            username.setBackgroundColor(Color.WHITE);
            password.setBackgroundColor(Color.WHITE);
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(Login.this, "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
            username.setBackgroundColor(Color.RED);
            password.setBackgroundColor(Color.RED);

        }


    }
}