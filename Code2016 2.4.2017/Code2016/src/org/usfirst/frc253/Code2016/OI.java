// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2016;

import org.usfirst.frc253.Code2016.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc253.Code2016.subsystems.*;
//me


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton goingUpLeft;
    public JoystickButton goingDownLeft;
    public JoystickButton bothArmUp;
    public JoystickButton bothArmDown;
    public Joystick leftJoystick;
    public JoystickButton goingUpRight;
    public JoystickButton goingDownRight;
    public JoystickButton joystickButton2;
    public Joystick rightJoystick;
    public JoystickButton BallPickUp;
    public JoystickButton BallPutdown;
    public JoystickButton StraightDrive;
    public JoystickButton ReverseStraightDrive;
    public JoystickButton PortAttackMode;
    
    public JoystickButton AccelData;
    public JoystickButton GearAutoCorrect;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        leftJoystick = new Joystick(0);
      
        
//        goingDownRight = new JoystickButton(rightJoystick, 6);
//        goingDownRight.whileHeld(new LiftRightDown());
//      
//        
//        goingUpRight = new JoystickButton(rightJoystick, 7);
//        goingUpRight.whileHeld(new LiftRightUp());
//        
//        
//        bothArmUp = new JoystickButton(rightJoystick, 5);
//        bothArmUp.whileHeld(new BothArmsUp());
//        
//        bothArmDown = new JoystickButton(rightJoystick, 4);
//        bothArmDown.whileHeld(new BothArmsDown());
//       
//        goingDownLeft = new JoystickButton(leftJoystick, 2);
//        goingDownLeft.whileHeld(new LiftLeftDown());
//        
//        
//        goingUpLeft = new JoystickButton(leftJoystick, 3);
//        goingUpLeft.whileHeld(new LiftLeftUp());
        
//        BallPutdown = new JoystickButton(rightJoystick, 5);
//        BallPutdown.whileHeld(new BallPicketCommandDown());
//        BallPutdown = new JoystickButton(leftJoystick, 1);
//        BallPutdown.whileHeld(new BallPicketCommandDown());
//        
//        BallPickUp = new JoystickButton(rightJoystick,4 );
//        BallPickUp.whileHeld(new BallPicketCommandUp());
//        BallPickUp = new JoystickButton(rightJoystick, 1);
//        BallPickUp.whileHeld(new BallPicketCommandUp());
        
        StraightDrive = new JoystickButton(rightJoystick, 6);
        StraightDrive.whileHeld(new StraightDrive());

//        PortAttackMode = new JoystickButton(rightJoystick, 8);
//        PortAttackMode.whenPressed(new PortAttackMode());
        
        ReverseStraightDrive = new JoystickButton(rightJoystick, 7);
        ReverseStraightDrive.whileHeld(new ReverseStraightDrive());
        
        GearAutoCorrect = new JoystickButton(rightJoystick, 3);
        GearAutoCorrect.whileHeld(new GearAutoCorrect());
        
        // SmartDashboard Buttons

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

     