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

    public void setEngineOk(boolean engineOk) {
        if (!isEngineOk) {
            this.engineOn = false;
        }
        isEngineOk = engineOk;
    }

    public void setFuelLevel(int fuelLevel) {
        if (fuelLevel <= 0) {
            this.engineOn = false;
        }
        this.fuelLevel = fuelLevel;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == Codes.ERROR_CHECK_ENGINE.getValue() || systemCheck == Codes.ERROR_NO_FUEL.getValue()) {
            this.engineOn = false;
        } else {
            this.engineOn = engineOn;
        }
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
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
        if (fuelLevel <= 0) {
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

    public String status() {
        if (systemCheck() == Codes.ALL_OK.getValue())
            return "Wszystkie systemy sprawne, mo??esz wyruszy?? w bezpieczn?? podr????";
        String status = "Status samochodu: \n";
        if (!isEngineOk)
            status += " > Silnik uszkodzony\n";
        if (fuelLevel == 0)
            status += " > Brak paliwa\n";
        if (fuelFlapOpen)
            status += " > Zamknij wlew paliwa\n";
        if (doorsOpen)
            status += " > Drzwi lub baga??nik s?? otwarte\n";
        if (engineOn)
            status += " > Silnik w????czony";
        else
            status += " > Silnik wy????czony";
        return status;
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
