package com.example.coffeeshops;

public class CoffeeShopItem {
    String nombre;
    String direccion;
    int imagen;
    float rating;

    public CoffeeShopItem(String nombre, String direccion, int imagen, float rating) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.imagen = imagen;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public float getRating() {
        return rating;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
