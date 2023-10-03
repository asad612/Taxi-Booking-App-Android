package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        findViewById(R.id.btn_forgot).setOnClickListener(v -> {
            Intent intent = new Intent(ForgotActivity.this, HomeActivity.class);
            Toast.makeText(ForgotActivity.this, "Verification Email sent.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
        findViewById(R.id.tv_back).setOnClickListener(v -> {
            Intent intent = new Intent(ForgotActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
