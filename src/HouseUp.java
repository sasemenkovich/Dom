/**
 * Created by Соня on 26.09.2014.
 */
public class HouseUp {
    public static void main(String [] args)
    {
        House h = new House(new Double(args[0]), new Double(args[1]), new Integer(args[2]));
        int power = 4; //задаем грузоподъемность шарика

        long before = (long)(System.currentTimeMillis());
        h.addBalloons(new Balloon(power)); //запускаем метод addballoons(Balloon balloon)
        long after = (long)(System.currentTimeMillis());
        System.out.println("Время в миллисекундах (balloon): " + (after - before) + "\n");

        before = (long)(System.currentTimeMillis());
        h.addBalloons(power); //запускаем метод addballoons(int balloon)
        after = (long)(System.currentTimeMillis());
        System.out.println("Время в миллисекундах (int): " + (after - before));
        /*
        быстрее работает метод addballoons(int balloon)
         */
    }
}
