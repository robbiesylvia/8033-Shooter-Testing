package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorControl;

public class RunMotor extends CommandBase {
    private final MotorControl motorControl;
    public RunMotor(MotorControl motorControl){
        this.motorControl = motorControl;
        addRequirements(motorControl);
    }

    @Override
    public void initialize() {
        motorControl.motorOn();
    }
}   