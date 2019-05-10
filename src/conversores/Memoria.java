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
    
    public double unidadbyte; //en bit
    
    public Memoria(double b, String s)
    {
        
        
        switch(s)
        {
            
            case "b":
                this.unidadbyte = b ;
            
            case "KB":
                this.unidadbyte = b * 8000;
            case "B":
                this.unidadbyte = b * 8 ;
            case "MB":
                this.unidadbyte = b * 3227.430348 ;
            case "GB":
                this.unidadbyte = b * 64824.671;
        }
    }
    
    
    public double cambiar(String unidad)
    {
        
        
        switch(unidad)
        {
            case "KB":
                return this.unidadbyte / 8000;
            
            case "B":
                return this.unidadbyte /8;
            
            case "MB":
                return this.unidadbyte / 3227.430348;
            
            case "GB":
                return this.unidadbyte / 64824.671;
                
            default :
                
                System.out.printf("Tipo de dato-memoria %s desconocido ",unidad);
                return 0;
        }
    }
    
    
    
}
