package com.ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Al correr este archivo se genera un archivo input que será leído por la clase
//Ejercicio1_mancha
public class GeneradorDeArchivoDeCasos {

    //Genera por 'g' cantidad de casos, una matriz de 'x'*'y' cuyo valor de cada coordenada
    //es una letra mayúscula al azar y lo escribe en un archivo txt 
    public void generar() throws IOException {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/archivo.txt"));

            Random r = new Random();
            //variable que determina el nro de casos
            int caso;
            numeroRandom(caso = r.nextInt(1));
//            int caso = 1;            
            char c;            
            List<String> strings = new ArrayList<>();

            for (int g = 0; g < caso; g++) {
                bw.write("# case " + (g + 1));
                bw.newLine();
                //variables que determinan el tamaño de la matriz
//                int y = 10000;
//                int x = 50;
                int contador = 0;
                int y = r.nextInt(100);//Original 10000
                int x = r.nextInt(100);//Original 10000

                long inicio = System.currentTimeMillis();
                
                for (int i = 0; i < y; i++) {
                    StringBuilder s = new StringBuilder("");
                    for (int j = 0; j < x; j++) {
                        //c = 'J';
                        c = (char) (r.nextInt(26) + 'A');
                        s.append(c);
                    }
                    contador++;
                    strings.add(s.toString());
                    
//                    Escritura en el archivo cada 10 lineas, se probo para ver el tema del uso de memoria
//                    if (contador > 10) {
//                        for (String st : strings) {
//                            System.out.println(st);
//                            bw.write(st);
//                            bw.newLine();
//                            contador = 0;
//                            strings=new ArrayList<>();
//                        }
//                    }

                }
                for (String st : strings) {
                            System.out.println(st);
                            bw.write(st);
                            bw.newLine();
                }
                System.out.println("Anduvo");
                bw.flush();
                long fin = System.currentTimeMillis();
                long diff = fin-inicio;
                System.out.println(diff + " ms");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error generando el archivo");
        }
    }
    
    public int numeroRandom(int numero){
        if(numero == 0){
            Random r = new Random();            
            int n = r.nextInt(3);
            return n;
        }else{
            return numero;
        }
    }
    
}
