package BadFormattedCode;

public class VehicleSimulator {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.travel(40);
        System.out.println(v1.toString());
    }
}