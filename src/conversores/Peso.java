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
public class Peso {

    public double valor; //En gramos

    public Peso(double d, String s) {
        s = s.toUpperCase();
        switch (s) {
            case "TON":
                this.valor = d * 1000000;
                break;
            case "KG":
                this.valor = d * 1000;
                break;
            case "G":
                this.valor = d;
                break;
            case "MG":
                this.valor = d / 1000;
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();
        switch (unidad) {
            case "TON":
                return this.valor / 1000000;
            case "KG":
                return this.valor / 1000;
            case "G":
                return this.valor;
            case "MG":
                return this.valor * 1000;
            default:
                System.out.printf("Tipo de unidad de peso %s desconocida\n", unidad);
                return 0;
        }
    }
}
