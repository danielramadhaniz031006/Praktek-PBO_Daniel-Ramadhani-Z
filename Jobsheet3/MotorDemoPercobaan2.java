package Jobsheet3;

public class MotorDemoPercobaan2 {

    public static void main(String[] args) {

        MotorPercobaan2 motor = new MotorPercobaan2();

        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}