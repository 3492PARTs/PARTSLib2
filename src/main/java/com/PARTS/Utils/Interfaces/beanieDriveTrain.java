// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.Utils.Interfaces;

import com.PARTS.Utils.sensors.LinearDistance;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public abstract class beanieDriveTrain extends SubsystemBase {


    public beanieDriveTrain(){

    }

    public abstract void move(double speed, double speed2);

    public abstract void moveVolts(double leftVoltage, double rightVoltage);
    
    public abstract beanieDriveTrain getInstance();

    public abstract void moveArcade(double d, double output);

    public abstract Pose2d currentPose();
         
    

    public abstract double getAngle();

    public abstract double getTurningRate();

    public abstract LinearDistance leftDistance();

    public abstract LinearDistance rightDistance();    

    public abstract void stop();

}
