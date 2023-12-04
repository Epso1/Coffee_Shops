package com.example.coffeeshops;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoffeeShopViewHolder extends RecyclerView.ViewHolder{

    ImageView imagen;
    TextView nombre;
    RatingBar ratingBar;
    TextView direccion;

    TextView valoracion;

    public CoffeeShopViewHolder(@NonNull View itemView) {
        super(itemView);
        imagen = itemView.findViewById(R.id.imagen);
        nombre = itemView.findViewById(R.id.nombre);
        ratingBar = itemView.findViewById(R.id.ratingBar);
        direccion = itemView.findViewById(R.id.direccion);
        valoracion = itemView.findViewById(R.id.valoracion);
    }
}
