public class Bus extends PublicTransportation {
    private int maxPassengers = 30;
    private int fee = 1000;
    private String status = "Running";

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

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }


    // 기능
    @Override
    public void changeGas(int gas) {
        setGas(getGas() + gas);
        if (getGas() < 10) {
            System.out.println("주유 필요");
            setStatus("Garage");
            setSpeed(0);
        } else {
            setStatus("Running");
            setSpeed(50);
        }
    }

    public void changeStatus() {
        if (this.status.equals("Garage")) {
            this.status = "Running";
            setSpeed(50);
        } else {
            this.status = "Garage";
            setSpeed(0);
        }
    }


    public String boardPassengers(int newPassengers) {
        if (status.equals("Garage")) {
            return "상태를 확인해주세요";
        } else if (getGas() < 10) {
            return "주유 필요";
        } else if (newPassengers > maxPassengers) {
            return "운행 인원을 초과하였습니다";
        } else {
            setSpeed(50);
            setCurrentPassengers(newPassengers);
            return "총 탑승자: " + newPassengers + " 잔여석: " + (maxPassengers - newPassengers) + " 총 요금: " + newPassengers * getFee();
        }
    }

}
