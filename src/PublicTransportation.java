public abstract class PublicTransportation {

    private static int serialNum = 0;
    private int num;

    public PublicTransportation() {
        serialNum++;
        this.num = serialNum;
    }

    private int gas = 100;
    private int speed = 0;

    private int currentPassengers;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    // 공통 기능
    public String changeSpeed(int newSpeed) {
        if (getGas() < 10) {
            return "주유량을 확인해주세요";
        } else if (!getStatus().equals("Running")) {
            return "상태를 확인해주세요";
        } else if (getSpeed() + newSpeed < 0) {
            return "속도가 음수입니다";
        } else {
            setSpeed(getSpeed() + newSpeed);
            return "변경";
        }
    }

    public abstract void changeGas(int gas);
}
