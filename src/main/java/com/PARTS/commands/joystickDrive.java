// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.commands;

import com.PARTS.Utils.Controls.beanieController;
import com.PARTS.Utils.Interfaces.beanieDriveTrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class joystickDrive extends CommandBase {
  beanieDriveTrain bDriveTrain;
  beanieController controller;
  /** Creates a new joystickDrive. */

  /**
   * 
   * @param bDriveTrain the drivetrain object
   * @param controller a beanie controller
   */
  public joystickDrive(beanieDriveTrain bDriveTrain, beanieController controller) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(bDriveTrain);
    this.bDriveTrain = bDriveTrain;
    this.controller = controller;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    bDriveTrain.moveArcade(controller.getLeftYAxis(), controller.getRightXAxis());
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    bDriveTrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
