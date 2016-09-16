
package uebung05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Schueler
 */
public class Kreisberechnung {
   

  
       
        public static void main (String args []) throws IOException {
        double radius, umfang, flaeche;
        String einheit,  eingabe;
        BufferedReader eingabepuffer = new BufferedReader (new InputStreamReader(System.in));
                System.out.print ("geben Sie den Kreisradius ein: ");
                eingabe = eingabepuffer.readLine();
                radius = Double.parseDouble (eingabe);
                System.out.print ("geben Sie die Einheit ein: ");
                eingabe = eingabepuffer.readLine ();
                einheit = eingabe;
                umfang = 2.0 * 3.1415926 * radius;
                flaeche = 3.1415926 * radius * radius;
                System.out.print("umfang; ");
                System.out.print(umfang);
                System.out.println("" + einheit);
                System.out.println("Fläche: ");
                System.out.println(flaeche);
                System.out.println ("" + einheit + '\u00b2');
                   
    }
    
}

    

