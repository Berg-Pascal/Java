
package uebung05;
class Bruch {
    int zaehler;
    int nenner;
    

  
 void multiplizieren(Bruch a)  {
     
     zaehler *= a.zaehler;
     nenner *= a.nenner;
    
 }
}

public class Uebung05 {

    public static void main(String[] args) {
        
       Bruch e = new Bruch();
       e.zaehler = 3;
       e.nenner = 12;
       
       
       
      
       Bruch b = new Bruch();
       b.zaehler = 3;
       b.nenner = 4;
       
       Bruch a = new Bruch();
       a.zaehler = 3;
       a.nenner = 5;
         
       Bruch c = new Bruch();
       c.zaehler = 4;
       c.nenner = 5;
      
      a.multiplizieren(b);
    
        System.out.println("Bruch b = " + b.zaehler + "/" + b.nenner);
        System.out.println("Bruch a = " + a.zaehler + "/" + a.nenner);
        System.out.println("Bruch c = " + c.zaehler + "/" + c.nenner);
   

                
        }
        
}