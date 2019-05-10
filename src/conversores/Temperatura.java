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
public class Temperatura {
    
    public double Temp; //En Celsius
    
    public Temperatura(double t,String s)
    {
        s=s.toUpperCase();
        
        switch(s)
        {
            case "K":
                this.Temp = t * 273.15;
            case "F":
                this.Temp = t * 32;
            case "C":
                this.Temp = t;
        }
        
    }
    
    
    public double Cambiar(String unidad)
    {
        unidad= unidad.toUpperCase();
        
        
        switch(unidad)
        {
            case "K":
                return this.Temp / 273.15;
            case "F":
                return this.Temp / 32;
            case "C":
                return this.Temp ;
                
            default :
                System.out.printf("Tipo de dato-distancia %s desconocido ",unidad);
                             return 0;
        }
        
    }
    
}
