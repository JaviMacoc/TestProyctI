package com.ex;


public class Main {

    public static void main(String[] args) {
        Clase1 clase1= new Clase1();
        GeneradorDeArchivoDeCasos g = new GeneradorDeArchivoDeCasos();
        LectorDeArchivos lector = new LectorDeArchivos();
        
        lector.listarArchivos();
//        g.generar();
        clase1.metodo1();
        
        clase1.getClase2().metodo2(clase1.getNumero(), clase1.getValorTotal(), clase1.getCantidad().valor);
    }
}
