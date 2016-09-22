/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung05;

/**
 *
 * @author Schueler
 */
public class Rechteck {
    
        double höhe;
        double breite;
        
        public Rechteck(double w1, double w2) {
            this.breite = w1;
            this.höhe = w2;
            
            
        }
        
        public static void main (String [] args)  {
            Rechteck r = new Rechteck (2 , 4);
            double Ergebnis = Umfang(r);
            
            
            System.out.println(Ergebnis);
        }
        
        public static double Umfang (Rechteck a)  {
            double Ergebnis = a.breite *2 + a.höhe *2;
            return Ergebnis;
            
        }
        
        public static double flaeche (Rechteck b)  {
            
            double Ergebnis = b.breite * b.höhe;
            return Ergebnis;
        }
}
