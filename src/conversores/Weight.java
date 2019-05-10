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

public class Weight
{
    public double valor; //En gramos
    
    public Weight(double d, String s)
    {
        s = s.toLowerCase();
        switch (s)
        {
            case "kg":
                this.valor = d * 1000;
            case "g":
                this.valor = d;
        }
    }

    public double Modify(String unidad)
    {
        unidad = unidad.toLowerCase();

        switch (unidad)
        {
            case "g":
                return this.valor;
            case "kg":
                return this.valor / 1000;
            default:
                System.out.printf("Tipo de dato %s desconocido", unidad);
                // Agregar un raise
                return 0;
        }
    }
}
