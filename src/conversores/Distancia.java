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
public class Distancia {
    
    public double Medida; //en metros
    
    public Distancia(double m, String s)
    {
        s= s.toUpperCase();
                
                switch(s)
                {
                    case "KM":
                        
                        this.Medida = m/1000;
                        
                    case "M":
                        this.Medida = m;
                        
                    case "IN":
                       this.Medida = m * 2.54;
                
                    case "CM":
                       this.Medida = m; 
                       
                    case "MI":
                        this.Medida = m;
                }
                
                
    }
    
     public double CambiarKilometrosAMetros(String unidad)
            {
                unidad=unidad.toUpperCase();
                     
                     switch(unidad)
                     {
                         case "KM":
                            return this.Medida *1000;
                            
                         case "M":
                             return this.Medida;
                             
                         case "P":
                            return this.Medida *39.37;
                
                         case "CM":
                              return this.Medida /100;
                              
                         case "MI":
                               return this.Medida * 0.000621371;
                             
                         default :
                             System.out.printf("Tipo de dato-distancia %s desconocido ",unidad);
                             return 0;
                     }
                
            }
    
}
