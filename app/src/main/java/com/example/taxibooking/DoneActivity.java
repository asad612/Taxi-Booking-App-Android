package com.example.taxibooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class DoneActivity extends AppCompatActivity {
    TextView rent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        ImageView home = findViewById(R.id.goback);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoneActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        TextView from = findViewById(R.id.from);
        TextView to = findViewById(R.id.to);
        rent = findViewById(R.id.rent);
        from.setText(HomeActivity.pickup);
        to.setText(DestinationActivity.dropoff);

        RadioButton ac = findViewById(R.id.ac);
        RadioButton nac = findViewById(R.id.nac);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rent.setText("Your Total Amount Will Be \n 450 Rs.");
            }
        });
        nac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rent.setText("Your Total Amount Will Be \n 300 Rs.");
            }
        });

        Button goo = findViewById(R.id.goo);
        goo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoneActivity.this, "Ride confirmed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DoneActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
