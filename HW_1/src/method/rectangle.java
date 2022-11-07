package method;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class rectangle {
    int x1, y1;
    int x2, y2;
    int y;
    public rectangle(int x1, int y1, int x2, int y2){

        this.x1 = min(x1, x2);
        this.y1 = min(y1, y2);
        this.x2 = max(x1, x2);
        this.y2 = max(y1, y2);;

    }


    public boolean checkConfilctTo(rectangle rect) {

        if (x1 < rect.x1 && x2 > rect.x1 && y1 < rect.y1 && y2 > rect.y1) {
            return true;
        }
        return x1 < rect.x2 && x2 > rect.x2 && y1 < rect.y2 && y2 > rect.y2;
    }

}
