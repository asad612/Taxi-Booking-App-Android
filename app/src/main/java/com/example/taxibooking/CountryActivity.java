package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class CountryActivity extends AppCompatActivity {
    private Spinner spinone;
    String[] arrayone =  {"Pakistan", "Australia", "Canada", "England", "Japan", "India"};
    Integer [] arraytwo = {R.drawable.pak, R.drawable.aus, R.drawable.can, R.drawable.eng, R.drawable.jap, R.drawable.ind};
    CustomAdapter adapter;
    ImageView previous, next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        spinone= (Spinner) findViewById(R.id.spinner);
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayone);
        adapter = new CustomAdapter(this,arrayone,arraytwo);
        spinone.setAdapter(adapter);

        spinone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //EditText text = (EditText) findViewById(R.id.show);
                //text.setText(spinone.getSelectedItem().toString());
                //Toast.makeText(MainActivity.this, "asad", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        });
    }
}
