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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public void changeGas(int gas) {
        setGas(getGas() + gas);
        if (getGas() < 10) {
            System.out.println("주유 필요");
            setStatus("Garage");
        } else {
            setStatus("Running");
        }
    }

    public void changeStatus() {
        if (this.status.equals("Garage")) {
            this.status = "Running";
        } else {
            this.status = "Garage";
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
