/**
 * Class Name: Client (secondMethod)
 * Class Desc: 
 * - Create sucket
 * - Add buffer to sucket
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static BufferedReader getInput(InputStream is) throws IOException {
        return new BufferedReader(new InputStreamReader(is));
    }

    private static BufferedReader getInput(Socket p) throws IOException {
        return new BufferedReader(new InputStreamReader(p.getInputStream()));
    }

    private static PrintWriter getoutput(Socket p) throws IOException {
        return new PrintWriter(new OutputStreamWriter(p.getOutputStream()), true);
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket theSocket = null;
        try {
            theSocket = new Socket("localhost", 2010);
            System.out.println(theSocket.getLocalSocketAddress());
            BufferedReader inVal = getInput(theSocket);
            PrintWriter envoyerVal = getoutput(theSocket);
            String colorVal=args[0];
            Thread SockOut = new Thread( new ServiceIO(inVal, envoyerVal, ": ", colorVal));
          
            SockOut.start();
     
            SockOut.join();
        } finally {
            if (theSocket != null) {
                theSocket.close();
            }
        }
    }
}