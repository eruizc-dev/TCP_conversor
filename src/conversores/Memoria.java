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
    
    public long valor; // En bit
    
    public Memoria(long b, String s)
    {
        switch(s)
        {
			case "GB":
                this.valor = b * 8589934592;
			case "MB":
                this.valor = b * 8388608;
			case "KB":
                this.valor = b * 8192;
			case "B":
                this.valor = b * 8;
            case "b":
                this.valor = b;
        }
    }
    
    public double cambiar(String unidad)
    {
        switch(unidad)
        {
            case "GB":
				return this.valor / 8589934592;
			case "MB":
				return this.valor / 8388608;  
			case "KB":
                return this.valor / 8192;
            case "B":
                return this.valor / 8;
            default :
                System.out.printf("Unidad de memoria %s desconocida",unidad);
                return 0;
        }
    }
}
