package com.rebelworks.course;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.tv_welcome);
        initData();
    }

    private void initData() {
        if (getIntent() != null) {
            String username = getIntent().getStringExtra("username_key");
            String password = getIntent().getStringExtra("password_key");
            tvWelcome.setText("Welcome mother " + username + " " + password);
        }
    }
}
