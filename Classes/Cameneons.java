/**
 * Class Name: Cameneos
 * Class Desc: 
 * - Create cameneos object
 * - Adding unique id + color
 * - Meet with partner to create a mutation
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 *
 */
public class Cameneons implements Runnable {

    public Mall Mall;
    public CameneosID id;

    public Color theColor,otherCameneonColor;

    public Cameneons(Mall Mall, CameneosID id, Color Color) {
        this.Mall = Mall;
        this.id = id;
        this.theColor = Color;
    }

    /**
     * Method Desc: 
     * -Provide:
     *  +Cameneos info
     *  +Cameneos Status 
     *
     * @param cameneosInfo Cameneos info parameter
     */
    public void returnCameneosInfo(String cameneosInfo) {
        System.out.println("My ID is: " + this.id);
        System.out.println("My Color is: " + this.theColor);
        System.out.println("My Info are: "+ cameneosInfo);
    }

    /**
     * Cette methode est utilise dans l'etat quand le cameneos mange
     * Method Desc: 
     * -Returns if the Cameneos is eating
     */
    public void eat() {
        this.returnCameneosInfo("I am eating");
    }
}
