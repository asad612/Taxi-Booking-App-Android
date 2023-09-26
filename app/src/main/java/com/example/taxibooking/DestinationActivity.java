package com.example.taxibooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

public class DestinationActivity extends AppCompatActivity {
    public static String dropoff = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        final SearchView dropoffloc = findViewById(R.id.dropoffloc);

        ImageView previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinationActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dropoff = dropoffloc.getQuery().toString();
                Intent intent = new Intent(DestinationActivity.this, DoneActivity.class);
                startActivity(intent);
            }
        });
    }
}
