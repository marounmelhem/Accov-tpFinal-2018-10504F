/**
 * Class Name: Play
 * Class Desc: 
 * - Play methods
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 * @author: Maroun Melhem <https://maroun.me>
 */

package Classes;

public class Play {

    //All color groups
    public static Color[] allColors=
    {
        Color.RED,
        Color.BLUE,
        Color.YELLOW,
        Color.BLUE,
        Color.RED,
        Color.BLUE,
    };

    //Cameneon objects
    public static Cameneons[] cameneonsGroup=new Cameneons[allColors.length];
    public static void main(String args[]){
        Mall currentMall=new Mall();
        for(int i =0;i<allColors.length;i++){
            cameneonsGroup[i]=new Cameneons(currentMall,new CameneosID(i),allColors[i]);
            new Thread(cameneonsGroup[i]).start();
        }
    }
    
}