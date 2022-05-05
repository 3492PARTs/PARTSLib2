// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.Utils.Controls;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class toggleRumbler extends CommandBase {
  beanieController controller;
  /** Creates a new toggleRumbler. */
  public toggleRumbler(beanieController controller) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.controller = controller;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    if(controller.isRumbling()){
      controller.Rumbling(Rumbler.stop);
    }
    else{
      controller.Rumbling(Rumbler.max);
    }
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
