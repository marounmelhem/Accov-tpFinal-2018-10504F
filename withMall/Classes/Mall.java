/**
 * Class Name: Mall
 * Class Desc: 
 * - Mall methods
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 * @author: Maroun Melhem <https://maroun.me>
 */
 
package Classes;

public class Mall {

    //Partner color
    public Color firstColor, secondColor;

    //1st thread arrival by cameneon
    public Boolean firstCameneonTask = true;

    //Check if mall has 2nd cameneon
    public Boolean makeWait = false;

    /**
     * Method Desc: 
     * -Handle cameneon cooperation
     *
     * @param otherCameneonColor Cameneos other color
     */
    public synchronized Color Cooperation(CameneosID id, Color Color) {
        Color newColor;
        //Keep other cameneons waiting if mall is working
        while (makeWait) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        if (this.firstCameneonTask) {
            this.firstColor = Color;
            this.firstCameneonTask = false;
            while (!this.firstCameneonTask) {
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
            this.makeWait=false;
            newColor=this.secondColor;
            notifyAll();
        }
        else{
            this.secondColor=Color;
            newColor=this.firstColor;
            this.firstCameneonTask=true;
            this.makeWait=true;
            notifyAll();
        }
        return newColor;
    }
}
