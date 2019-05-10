/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author Emili
 */
public class Tiempo {
    
    private double valor; // En segundos
    
    public Tiempo(double num, String s){
        
        s = s.toUpperCase();
        switch (s)
        {
            case "DIA":
                this.valor = num * 86400;
            case "HR":
                this.valor = num * 3600;
            case "MIN":
                this.valor = num * 60;
            case "SEG":
                this.valor = num;
        }
    }
    
    public double Cambiar(String unidad)
    {
        unidad = unidad.toUpperCase();

        switch (unidad)
        {
            case "DIA":
                return this.valor / 86400;
            case "HR":
                return this.valor / 3600;
            case "MIN":
                return this.valor / 60;
            case "SEG":
                return this.valor;
            default:
				System.out.printf("Unidad de tiempo %s desconocida", unidad);
                return 0;
        }
    }
}
