package com.example.contigoperuempleado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.contigoperuempleado.adapters.CitasPendientesAdapter;
import com.example.contigoperuempleado.models.CitaModel;

import java.util.ArrayList;
import java.util.List;

public class CitasPendientesActivity extends AppCompatActivity implements CitasPendientesInterface.RowListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas_pendientes);
        List<CitaModel> lista = new ArrayList<>();
        lista.add(new CitaModel());
        lista.add(new CitaModel());
        lista.add(new CitaModel());
        lista.add(new CitaModel());
        lista.add(new CitaModel());
        lista.add(new CitaModel());
        RecyclerView recyclerViewCitasPendientes = findViewById(R.id.recyclerview_citas_pendientes);
        CitasPendientesAdapter adapter = new CitasPendientesAdapter(lista,R.layout.row_cita_pendiente,this);
        LinearLayoutManager l = new LinearLayoutManager(this);
        l.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewCitasPendientes.setLayoutManager(l);
        recyclerViewCitasPendientes.hasFixedSize();
        recyclerViewCitasPendientes.setAdapter(adapter);
    }

    @Override
    public void onClickCitaPendienteButton() {
        Intent i = new Intent(this,ProgramarCitaActivity.class);
        startActivity(i);
    }
}