package com.Reva.Modul1.Konversi;

public class Konversi {

    // Konversi suhu dari Celcius ke Fahrenheit
    public float Celcius_Fahrenheit(float suhu){
        float hasil = (suhu * 9/5) + 32;
        return hasil;
    }
    //Konversi suhu dari Fahrenheit ke Kelvin
    public float Fahrenheit_Kelvin(float suhu) {
        float hasil = (suhu - 32) * 5/9 + 273;
        return hasil;
    }
    // Konversi suhu dari Kelvin ke Reamur
    public float Kelvin_Reamur(float suhu) {
        float hasil = (suhu - 273) * 4/5;
        return hasil;
    }
    // Konversi suhu dari Reamur ke Celcius
    public float CelciusFahrenheit(float suhu) {
        float hasil = suhu * 5/4;
        return hasil;
    }
}

