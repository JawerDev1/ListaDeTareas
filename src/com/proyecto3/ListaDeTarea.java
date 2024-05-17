package com.proyecto3;

import java.util.Scanner;

public class ListaDeTarea {
    private String nombre;
    private boolean completada;

    public ListaDeTarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = isCompletada() ? "[✓]" : "[ ]";
        return nombre + " " + estado;
    }
}
