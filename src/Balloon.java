/**
 * Created by Соня on 26.09.2014.
 */
public class Balloon {

    private int power; //грузоподъемность шарика в граммах

    public Balloon() {
        this.power = 3; //стандартный шарик поднимает 3 грамма
    }

    public Balloon(int p) {
        this.power = p; //можно задать другую грузоподъемность шарика
    }

    public double getPower() {
        return this.power;
    }



}
