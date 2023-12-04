package com.example.coffeeshops;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeShopAdapter extends RecyclerView.Adapter<CoffeeShopViewHolder> {

    public ArrayList<CoffeeShopItem> coffeeShops = new ArrayList<>(Arrays.asList(
        new CoffeeShopItem("Antico Caffè Greco", "St.Italy, Rome", R.drawable.images, 0f),
            new CoffeeShopItem("Café de Flore", "St.Germain, Paris", R.drawable.images1, 0f),
            new CoffeeShopItem("Café Tortoni", "St. de Mayo, Buenos Aires", R.drawable.images2, 0f),
            new CoffeeShopItem("Café Central", "St. Herrengasse, Vienna", R.drawable.images3, 0f),
            new CoffeeShopItem("Café Imperial", "St. Na Poříčí, Prague", R.drawable.images4, 0f),
            new CoffeeShopItem("Café New York", "St. Erzsébet krt., Budapest", R.drawable.images5, 0f),
            new CoffeeShopItem("Café de la Paix", "St. de l'Opéra, Paris", R.drawable.images6, 0f)
    ));

    @NonNull
    @Override
    public CoffeeShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new CoffeeShopViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeShopViewHolder holder, int position) {

        CoffeeShopItem item = coffeeShops.get(position);
        holder.direccion.setText(item.getDireccion());
        holder.imagen.setImageResource(item.getImagen());
        holder.nombre.setText(item.getNombre());

        holder.ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            holder.valoracion.setText(String.valueOf(rating));
        });
    };

    @Override
    public int getItemCount() {
        return coffeeShops.size();
    }
}
