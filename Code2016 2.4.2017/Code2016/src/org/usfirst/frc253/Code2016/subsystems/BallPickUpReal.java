package org.usfirst.frc253.Code2016.subsystems;

import org.usfirst.frc253.Code2016.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class BallPickUpReal extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

   
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
   

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private SpeedController m = RobotMap.BallPickUpSystemTalon;


// Put methods for controlling this subsystem
// here. Call these from Commands.

public void initDefaultCommand() {}
    public BallPickUpReal() {
    	super();
//    	 motor1 = new Talon (5);
//    	 motor2 = new Talon (4);
    	 PickDown();
    	 PickUp();
    	 
    }

public void PickDown() {
	m.set(-0.65);	
}
public void FullStop() {
	m.set(0);
}

public void PickUp() {
m.set(0.9);


}
}
