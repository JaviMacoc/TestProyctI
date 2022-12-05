package com.ex;

import java.math.BigDecimal;


public class Clase1 {

    private int numero;
    private String palabra;
    private Contador valorTotal= new Contador();
    private Contador cantidad= new Contador();
    private Clase2 clase2= new Clase2();
    
        
    public String metodo1(){
        System.out.println("Ini metodo1()");
        BigDecimal bd=new BigDecimal("10.05357");
        numero=10;
        clase2.metodo2(numero, valorTotal, cantidad.valor);
        System.out.println("cantidad: " + cantidad.valor);
        System.out.println("valorTotal; " + valorTotal.valor);
        System.out.println("numero: " + numero);
        System.out.println("Fin metodo1()");
        System.out.println("BD: " + bd);
        if(cantidad.valor!=0 || valorTotal.valor!=0 ){
            return "ok";
        }else{
            return "bad";
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Contador getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Contador valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Contador getCantidad() {
        return cantidad;
    }

    public void setCantidad(Contador cantidad) {
        this.cantidad = cantidad;
    }

    public Clase2 getClase2() {
        return clase2;
    }

    public void setClase2(Clase2 clase2) {
        this.clase2 = clase2;
    }
    
    
}
