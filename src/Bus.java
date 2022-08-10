public class Bus extends PublicTransportation {

    public Bus(int maxPassengers, int fee, String status) {
        super(maxPassengers, fee, status);
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
        if (getStatus().equals("Garage")) {
            setStatus("Running");
            setSpeed(50);
        } else {
            setStatus("Garage");
            setSpeed(0);
        }
    }


    public String boardPassengers(int newPassengers) {
        if (getStatus().equals("Garage")) {
            return "상태를 확인해주세요";
        } else if (getGas() < 10) {
            return "주유 필요";
        } else if (newPassengers > getMaxPassengers()) {
            return "운행 인원을 초과하였습니다";
        } else {
            setSpeed(50);
            setCurrentPassengers(newPassengers);
            return "총 탑승자: " + newPassengers + " 잔여석: " + (getMaxPassengers() - newPassengers) + " 총 요금: " + newPassengers * getFee();
        }
    }

}
