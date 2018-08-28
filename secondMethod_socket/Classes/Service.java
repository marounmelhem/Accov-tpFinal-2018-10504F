/**
 * Class Name: Service (secondMethod)
 * Class Desc: 
 * - Handle secondMethod mutation
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 * @author: Maroun Melhem <https://maroun.me>
 *
 */
package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceIO implements Runnable
{
    private final String strVal;
    private final PrintWriter out;
    private final BufferedReader in;
    private  String colorVal ;

    public ServiceIO(BufferedReader in, PrintWriter out,String strVal,String colorVal) {
        this.in = in;
        this.out = out;
        this.strVal=strVal;
        this.colorVal=colorVal;
    }
    
    
    public void run() {
        while(true){
        try {
            System.out.println("Running...");
              try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServiceIO.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("I am going to Mall (secondMethod)");
              try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServiceIO.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("I am mutating, current color: "+colorVal);
              try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServiceIO.class.getName()).log(Level.SEVERE, null, ex);
            }

            String line;
            out.printf("%s\n", colorVal);
            out.flush();
            
            if ((line = in.readLine()) != null) {               
                this.colorVal=line;
                System.out.println("Done mutating, new color: "+colorVal);
              
            }
        } catch (IOException ex) {
            Logger.getLogger(ServiceIO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        }
    }
}