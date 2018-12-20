/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Mazedul Islam
 */
public class CSVFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String path = "E:\\Education\\2.2\\Java\\Java lab\\Resources2\\data\\2012\\weather-2012-12-19.csv";
       File file = new File(path);
       
       try{
           
          Scanner inputStream = new Scanner(file);
          inputStream.next();
          while(inputStream.hasNext()){
              
              
              String data = inputStream.next();
              
                  System.out.println(data);
              
              
            }
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
