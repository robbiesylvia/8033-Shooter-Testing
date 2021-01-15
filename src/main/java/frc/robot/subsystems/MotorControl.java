package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// allows motor to turn on to 1/2 speed, set speed to 1/4, set speed to full speed, and turn motor off
public class MotorControl extends SubsystemBase {
    public final double defaultSpeed = 0.5;
    private Spark motorController = new Spark(0);
    public void motorOn() { 
        motorController.setSpeed(defaultSpeed);
    }
    public void motorOff() {
        motorController.disable();
    }
    public void fullSpeed() {
        motorController.setSpeed(1);
    }
    public void quarterSpeed() {
        motorController.setSpeed(0.25);
    }
    
}
    
