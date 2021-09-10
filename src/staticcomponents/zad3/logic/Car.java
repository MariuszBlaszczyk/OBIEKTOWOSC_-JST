package staticcomponents.zad3.logic;

import java.util.Objects;

public class Car {

    private int fuelLevel;
    private boolean isEngineOk;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;
    private boolean engineOn;

    public Car(int fuelLevel, boolean isEngineOk, boolean fuelFlapOpen, boolean doorsOpen, boolean engineOn) {
        this.fuelLevel = fuelLevel;
        this.isEngineOk = isEngineOk;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
        this.engineOn = engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public int start() {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

    private int systemCheck() {
        if (!isEngineOk) {
            return Codes.ERROR_CHECK_ENGINE.getValue();
        }
        if (fuelLevel == 0) {
            return Codes.ERROR_NO_FUEL.getValue();
        }
        if (fuelFlapOpen) {
            return Codes.WARNING_FUEL_FLAP_OPEN.getValue();
        }
        if (doorsOpen) {
            return Codes.WARNING_DOORS_OPEN.getValue();
        }
        return Codes.ALL_OK.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelLevel == car.fuelLevel && isEngineOk == car.isEngineOk && fuelFlapOpen == car.fuelFlapOpen && doorsOpen == car.doorsOpen && engineOn == car.engineOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelLevel, isEngineOk, fuelFlapOpen, doorsOpen, engineOn);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", isEngineOk=" + isEngineOk +
                ", fuelFlapOpen=" + fuelFlapOpen +
                ", doorsOpen=" + doorsOpen +
                ", engineOn=" + engineOn +
                '}';
    }
}
