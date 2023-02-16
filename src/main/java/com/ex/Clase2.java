package com.ex;

public class Clase2 {

       
    public String metodo2(int numero, Contador valorTotal, int cantidad) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                cantidad++;
            }
            valorTotal.valor++;
            numero++;
        }
        String s = "catidad: " + cantidad + ", valorTotal: " + valorTotal.valor + ", numero " + numero;
        System.out.println(s);
        return s;
    }
    
    
}
