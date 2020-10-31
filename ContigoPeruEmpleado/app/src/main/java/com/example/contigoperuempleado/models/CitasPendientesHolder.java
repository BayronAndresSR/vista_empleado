package com.example.contigoperuempleado.models;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contigoperuempleado.CitasPendientesInterface;
import com.example.contigoperuempleado.R;
import com.google.android.material.button.MaterialButton;

public class CitasPendientesHolder extends RecyclerView.ViewHolder{

    CitasPendientesInterface.RowListener rowListener;
    public CitasPendientesHolder(@NonNull View itemView, final CitasPendientesInterface.RowListener rowListener) {
        super(itemView);
        this.rowListener = rowListener;
        MaterialButton btnTomar = itemView.findViewById(R.id.btnTomarCitaPendiente);
        btnTomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rowListener.onClickCitaPendienteButton();
            }
        });
    }
}
