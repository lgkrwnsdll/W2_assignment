public class PublicTransportation {

    private static int serialNum = 0;
    private int num;

    public PublicTransportation() {
        serialNum++;
        this.num = serialNum;
    }

    private int gas = 100;
    private int speed = 0;

    private int currentPassengers;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

}
