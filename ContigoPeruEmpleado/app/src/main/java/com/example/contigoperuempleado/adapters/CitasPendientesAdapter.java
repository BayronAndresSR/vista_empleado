package com.example.contigoperuempleado.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contigoperuempleado.CitasPendientesInterface;
import com.example.contigoperuempleado.R;
import com.example.contigoperuempleado.models.CitaModel;
import com.example.contigoperuempleado.models.CitasPendientesHolder;

import java.util.List;

public class CitasPendientesAdapter extends RecyclerView.Adapter<CitasPendientesHolder> {
    private List<CitaModel> lista;
    private int layoutItem;
    private CitasPendientesInterface.RowListener rowListener;


    public CitasPendientesAdapter(List<CitaModel> lista, int layoutItem, CitasPendientesInterface.RowListener rowListener) {
        this.lista = lista;
        this.layoutItem = layoutItem;
        this.rowListener = rowListener;
    }

    @NonNull
    @Override
    public CitasPendientesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cita_pendiente,parent,false);
        return new CitasPendientesHolder(v,rowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CitasPendientesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}


