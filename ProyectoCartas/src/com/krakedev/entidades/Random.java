package com.krakedev.entidades;

public class Random {
    public static int obtenerPosicion() {
        // Multiplicarlo por 52 para obtener un número entre 0 (incluido) y 51 (incluido)
        return (int) (Math.random() * 52);
    }
}

