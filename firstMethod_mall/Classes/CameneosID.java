/**
 * Class Name: CameneosID (firstMethod)
 * Class Desc: 
 * - Provide unique ID for Cameneos
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 * @author: Maroun Melhem <https://maroun.me>
 */
package Classes;

public class CameneosID {
    private final int id;
    public CameneosID(int id)
    {
        this.id=id;
    }
    public String toString(){
        return "Cameneon is: "+this.id;
    }
}
