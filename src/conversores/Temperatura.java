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
        s=s.toUpperCase()
        
        switch(s)
        {
            case "K":
                this.Temp = t;
            case "F":
                this.Temp = t;
            case "C":
                this.Temp = t;
        }
    }
    
}
