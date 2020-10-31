package com.example.contigoperuempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.button.MaterialButton;

public class CitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        String[] lista = new String[]{"asd1" , "asd2" , "asd3"};
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lista);
        AutoCompleteTextView autoComplete = findViewById(R.id.autoComplete);
        autoComplete.setAdapter(adapter);

        MaterialButton btnBuscarCitas = findViewById(R.id.btnBuscarCitas);
        btnBuscarCitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrActividadCitasPendientes();
            }
        });


    }

    void IrActividadCitasPendientes(){
        Intent i = new Intent(this,CitasPendientesActivity.class);
        startActivity(i);
    }
}