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
     * Method Desc: 
     * -Returns if the Cameneos is eating
     */
    public void eat() {
        this.returnCameneosInfo("I am eating");
    }

    /**
     * Method Desc: 
     * -Returns if the Cameneos is training
     */
    public void training() {
        this.returnCameneosInfo("I am training");
    }

    /**
     * Method Desc: 
     * -Returns if the Cameneos is going to Mall
     */
    public void goToMall() {
        this.returnCameneosInfo("I am going to Mall");
    }

    /**
     * Method Desc: 
     * -Handle mutation
     *
     */
    public void doMutation() {
        this.returnCameneosInfo("I am doing a mutation");
        //do cooperation here (pending / UPDATED)
        this.otherCameneonColor=Mall.Cooperation(this.id, monColor);
        //do colorChange here (pending / UPDATED)
        this.monColor=this.monColor.changerColor(otherCameneonColor);
        this.returnCameneosInfo("Mutation is done");
    }

    public void run() {
        while (true) {
            eat();
            training();
            goToMall();
            doMutation();
        }
    }
}
