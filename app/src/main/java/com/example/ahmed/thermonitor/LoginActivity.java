package com.example.ahmed.thermonitor;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button b1;
    EditText e1 , e2 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button)findViewById(R.id.loginBtn);
        e1 = (EditText)findViewById(R.id.mailText);
        e2 = (EditText)findViewById(R.id.passText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, com.example.ahmed.thermonitor.ListActivity.class));
            }
        });
    }
}
