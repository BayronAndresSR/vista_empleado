package com.example.contigoperuempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        MaterialCardView cardCitas = findViewById(R.id.card_citas);
        cardCitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrACitasActivity();
            }
        });
    }

    void IrACitasActivity(){
        Intent i = new Intent(this,CitasActivity.class);
        startActivity(i);
    }
}