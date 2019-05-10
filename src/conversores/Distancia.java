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
    
    public double valor; // En metros
    
    public Distancia(double m, String s)
    {
        s= s.toUpperCase();
        
		switch(s)
		{
			case "KM":
				this.valor = m / 1000;
			case "M":
				this.valor = m;
			case "CM":
				this.valor = m * 1000; 
			case "MI":
				this.valor = m * 1609.34;
			case "IN":
				this.valor = m * 2.54;
		}   
    }

    public double CambiarKilometrosAMetros(String unidad)
    {
        unidad = unidad.toUpperCase();

		switch(unidad)
		{
			case "KM":
				return this.valor * 1000;
			case "M":
				return this.valor;
			case "CM":
				return this.valor / 100;
			case "MI":
				return this.valor * 0.000621371;
			case "IN":
				return this.valor * 39.3701;	
			default:
				System.out.printf("Unidad de distancia %s desconocida", unidad);
			return 0;
		}
	}
}
