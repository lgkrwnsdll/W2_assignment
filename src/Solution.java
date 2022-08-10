public class Solution {

    public static void main(String[] args) {
        PublicTransportation pt = new PublicTransportation();
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();

        System.out.println(b2.boardPassengers(2));
        b2.changeGas(-50);
        b2.changeStatus();
        b2.changeGas(10);
        b2.changeStatus();
        System.out.println(b2.boardPassengers(45));
        System.out.println(b2.boardPassengers(5));
        b2.changeGas(-55);
        System.out.println(b2.getStatus());
        b2.changeGas(+5);
        System.out.println(b2.boardPassengers(1));
    }
}