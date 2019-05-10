/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author Matias
 */
public class Memoria {
    
    public double unidadbyte; //en Megabytes
    
    public Memoria(double b, String s)
    {
        s=s.toLowerCase();
        
        switch(s)
        {
            case "KB":
                this.unidadbyte = b * 1024;
            case "B":
                this.unidadbyte = b * 1048576 ;
            case "MB":
                this.unidadbyte = b ;
            case "GB":
                this.unidadbyte = b / 1024;
        }
    }
    
    
    public double cambiar(String unidad)
    {
        unidad = unidad.toUpperCase();
        
        switch(unidad)
        {
            case "KB":
                return this.unidadbyte /1024;
            
            case "B":
                return this.unidadbyte /1048576;
            
            case "MB":
                return this.unidadbyte;
            
            case "GB":
                return this.unidadbyte * 1024;
                
            default :
                
                System.out.printf("Tipo de dato-memoria %s desconocido ",unidad);
                return 0;
        }
    }
    
    
    
}
