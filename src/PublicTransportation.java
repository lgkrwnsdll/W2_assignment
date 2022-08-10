public abstract class PublicTransportation {

    private static int serialNum = 0;
    private int num;

    private int gas = 100;
    private int speed = 0;

    private int currentPassengers;
    private int maxPassengers;

    private int fee;
    private String status;

    public PublicTransportation(int maxPassengers, int fee, String status) {
        serialNum++;
        this.num = serialNum;
        this.maxPassengers = maxPassengers;
        this.fee = fee;
        this.status = status;
    }

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

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        PublicTransportation.serialNum = serialNum;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
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
