class Thermostat extends Device {
    double temperatureSetting;

    void displayStatus() {
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}
