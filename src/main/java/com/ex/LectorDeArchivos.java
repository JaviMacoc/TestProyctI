package com.ex;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class LectorDeArchivos {

    String path = "C:\\Users\\Usuario\\Desktop\\Javi\\Programación\\TestCarpeta";
    
    public void listarArchivos(){
        File[] archivos = new File(path).listFiles();
        
        List<File> archivosList = Arrays.asList(archivos);
        
        archivosList.forEach( f -> {
            System.out.println(f.getName());
        });
        
    }
    
}
