public class Taxi extends PublicTransportation {
    private int maxPassengers = 4;
    private int fee = 3000;
    private String status = "Normal";

    private int baseDistance = 1;
    private int extraFee = 1000;
    private String destination;
    private int curDistance;
    private int totalFee;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCurDistance() {
        return curDistance;
    }

    public void setCurDistance(int curDistance) {
        this.curDistance = curDistance;
    }

    public int getBaseDistance() {
        return baseDistance;
    }

    public void setBaseDistance(int baseDistance) {
        this.baseDistance = baseDistance;
    }

    public int getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    // 기능
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

    public void changeGas(int gas) { // 도착함을 가정
        setGas(getGas() + gas);
        if (getGas() < 10) {
            System.out.println("주유 필요");
            setStatus("No boarding");
            setSpeed(0);
        } else {
            setStatus("Normal");
            setSpeed(0);
        }
    }

    public String boardPassengers(int newPassengers, String destination, int distance) {
        if (!status.equals("Normal")) {
            return "상태를 확인해주세요";
        } else if (getGas() < 10) {
            return "주유 필요";
        } else if (newPassengers > maxPassengers) {
            return "운행 인원을 초과하였습니다";
        } else {
            setStatus("Running");
            setSpeed(50);
            setCurrentPassengers(newPassengers);
            setDestination(destination);
            setCurDistance(distance);
            int feeToPay = (fee + (distance - baseDistance) * extraFee);
            return "총 탑승자: " + newPassengers + " 잔여석: " + (maxPassengers - newPassengers) + " 지불할 요금: " + feeToPay;
        }
    }

    public void payFee() {
        int feeToPay = (fee + (getCurDistance() - baseDistance) * extraFee);
        System.out.println("최종 요금: " + feeToPay);
        setStatus("Normal");
        setSpeed(0);
        setCurrentPassengers(0);
        setDestination(null);
        setCurDistance(0);
        setTotalFee(getTotalFee() + feeToPay); // 누적 요금
    }

}
