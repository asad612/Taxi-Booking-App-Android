package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PanelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        findViewById(R.id.btn_signIn).setOnClickListener(v -> {
            Intent intent = new Intent(PanelActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.btn_signUp).setOnClickListener(v -> {
            Intent intent = new Intent(PanelActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}
