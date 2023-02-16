package com.ex;


public class Main {

    static int z= 10;
    public static void main(String[] args) {
        Clase1 clase1= new Clase1();
        GeneradorDeArchivoDeCasos g = new GeneradorDeArchivoDeCasos();
        LectorDeArchivos lector = new LectorDeArchivos();
        
        lector.listarArchivos();
//        g.generar();
        clase1.metodo1();
        
        System.out.println(clase1);
        
        clase1.getClase2().metodo2(clase1.getNumero(), clase1.getValorTotal(), clase1.getCantidad().valor);
        System.out.println(clase1);
        
        //A partir de esta linea , pruebo codigo de las preguntas del sitio 'https://www.surveygizmo.com/s3/4548920/Oracle-Practice-Quiz-Oracle-Certified-Associate-OCA-Java-Programmer-Quiz-1'
        int x = 0, y = 10;
        try {
            y/=x;
        } catch (Exception e) {
            System.out.println("error");
        }
        
        for(int z=0; z<5; z++){
            
        }
        System.out.println(z);
        
        int c[] = {1,53,5};
        int d[][] = {{1,3,5},{2,4,5},{1,43,5}};
        
        System.out.println(c[1] + ", " + d[2][1]);
        System.out.println(c[1]==d[2][1]);
        
        Contador cont = new Contador();
        cont.valor = 1;
        Contador cont2 = Main.change(cont);
        
        System.out.println(cont.valor + ", " + cont2.valor );

        System.out.println("fin");        
    }
    
    static private Contador change(Contador cont){
        
        Contador h = cont;
        h.valor = 11;
        return h;
    }
}
