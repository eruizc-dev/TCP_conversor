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

public class Peso
{
    public double valor; //En gramos
    
    public Peso(double d, String s)
    {
        s = s.toUpperCase();
        switch (s)
        {
            case "TON":
                this.valor = d * 1000000;
            case "KG":
                this.valor = d * 1000;
            case "G":
                this.valor = d;
            case "MG":
                this.valor = d / 1000;
        }
    }

    public double Cambiar(String unidad)
    {
        unidad = unidad.toUpperCase();

        switch (unidad)
        {
            case "G":
                return this.valor;
            case "KG":
                return this.valor / 1000;
            default:
                System.out.printf("Tipo de dato %s desconocido", unidad);
                // Agregar un raise
                return 0;
        }
    }
}
