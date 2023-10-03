package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class DoneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        findViewById(R.id.back).setOnClickListener(v -> {
            Intent intent = new Intent(DoneActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        TextView rent = findViewById(R.id.rent);
        TextView from = findViewById(R.id.from);
        TextView to = findViewById(R.id.to);
        from.setText(HomeActivity.pickup);
        to.setText(DestinationActivity.dropoff);
        findViewById(R.id.ac).setOnClickListener(v -> rent.setText("Your Total Amount Will Be \n 450 Rs."));
        findViewById(R.id.nac).setOnClickListener(v -> rent.setText("Your Total Amount Will Be \n 300 Rs."));

        Button goo = findViewById(R.id.goo);
        goo.setOnClickListener(v -> {
            Toast.makeText(DoneActivity.this, "Ride confirmed", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DoneActivity.this, HomeActivity.class);
            startActivity(intent);
        });


    }
}
