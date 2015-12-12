package org.usfirst.frc.team4536.robot.commands;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4536.robot.OI;
import org.usfirst.frc.team4536.robot.RobotMap;

public class Piston_Extend extends CommandBase {
	
	boolean extend = OI.extendPiston.get();
    public Piston_Extend() {
    	requires (piston);
    }

	// Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(extend){
        piston.extend();
    		}

  	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
