package Coupling;

public class RemoteControl {
    private boolean isOn = false;
    private int volumeIncrease;
    private int volumeDecrease;

    private int transistor1;
    private int transistor2;
    private int transistor3;

    private int getTransistor1() {
        return transistor1;
    }

    private void setTransistor1(int transistor1) {
        this.transistor1 = transistor1;
    }

    private int getTransistor2() {
        return transistor2;
    }

    private void setTransistor2(int transistor2) {
        this.transistor2 = transistor2;
    }

    private int getTransistor3() {
        return transistor3;
    }

    private void setTransistor3(int transistor3) {
        this.transistor3 = transistor3;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        this.isOn = true;
    }

    public int getVolumeIncrease() {
        return volumeIncrease;
    }

    public void setVolumeIncrease(int volumeIncrease) {
        this.volumeIncrease = volumeIncrease;
    }

    public int getVolumeDecrease() {
        return volumeDecrease;
    }

    public void setVolumeDecrease(int volumeDecrease) {
        this.volumeDecrease = volumeDecrease;
    }
}
