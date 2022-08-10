public class Solution {

    public static void main(String[] args) {
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        System.out.println(b1.getNum());
        System.out.println(b2.getNum());
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());


        //System.out.println(b2.boardPassengers(2));
        //b2.changeGas(-50);
        //b2.changeStatus();
        //b2.changeGas(10);
        //b2.changeStatus();
        //System.out.println(b2.boardPassengers(45));
        //System.out.println(b2.boardPassengers(5));
        //b2.changeGas(-55);
        //System.out.println(b2.getStatus());

        System.out.println(t1.boardPassengers(2, "서울역", 2));
        t1.changeGas(-80);
        t1.payFee();
        System.out.println(t1.getGas());
        System.out.println(t1.getTotalFee());
        System.out.println(t1.boardPassengers(5, "서울역", 2));
        System.out.println(t1.boardPassengers(3, "구로디지털단지역", 12));
        t1.changeGas(-20);
        t1.payFee();
        System.out.println(t1.getTotalFee());
    }
}