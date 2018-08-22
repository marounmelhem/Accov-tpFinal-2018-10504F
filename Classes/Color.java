/**
 * Class Name: Color
 * Class Desc: 
 * - Color management of cameneon
 *
 * @version 1.0
 * @package: Accov-tpFinal-2018-10504F
 * @developer: Maroun Melhem <https://maroun.me>
 * @author: Maroun Melhem <https://maroun.me>
 */

package Accov-tpFinal-2018-10504F;
public class Color {

    public int InteriorColor;
    private static final int blueColor = 0;
    private static final int redColor = 1;
    private static final int yellowColor = 2;
    public static final Color BLUE = new Color(blueColor);
    public static final Color RED = new Color(redColor);
    public static final Color YELLOW = new Color(yellowColor);

    public Color(int colorValue) {
        this.InteriorColor = colorValue % 3;
    }


     /**
     * Method Desc: 
     * -Change Cameneos color 
     *
     * @param otherCameneonColor Cameneos other color
     */
    public Color changerColor(Color otherCameneonColor) {
        if (this.InteriorColor == otherCameneonColor.InteriorColor) {
            return new Color(this.InteriorColor);
        }
        return new Color(3 - this.InteriorColor - otherCameneonColor.InteriorColor);
    }

    @Override
    public String toString() {
        if (this.InteriorColor == blueColor) {
            return "BLUE";
        } else if (this.InteriorColor == redColor) {
            return "RED";
        }
        return "YELLOW";
    }

}
