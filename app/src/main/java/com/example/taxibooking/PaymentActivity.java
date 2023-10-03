package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.braintreepayments.cardform.view.CardForm;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        findViewById(R.id.back).setOnClickListener(v -> {
            Intent intent = new Intent(PaymentActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.btnPay).setOnClickListener(v -> {
            Intent intent = new Intent(PaymentActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        CardForm cardForm = findViewById(R.id.card_form);

        cardForm.cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                .postalCodeRequired(true)
                .mobileNumberRequired(true)
                .mobileNumberExplanation("SMS is required on this number")
                .setup(PaymentActivity.this);

    }
}
