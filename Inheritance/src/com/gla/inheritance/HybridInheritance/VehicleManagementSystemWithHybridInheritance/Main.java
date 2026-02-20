class Main {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        PetrolVehicle p = new PetrolVehicle();
        e.charge();
        p.refuel();
    }
}
