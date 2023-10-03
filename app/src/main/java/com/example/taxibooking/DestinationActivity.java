package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

public class DestinationActivity extends AppCompatActivity {
    public static String dropoff = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        final SearchView dropoffloc = findViewById(R.id.dropoff);

        findViewById(R.id.back).setOnClickListener(v -> {
            Intent intent = new Intent(DestinationActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.next).setOnClickListener(v -> {
            dropoff = dropoffloc.getQuery().toString();
            Intent intent = new Intent(DestinationActivity.this, DoneActivity.class);
            startActivity(intent);
        });
    }
}
