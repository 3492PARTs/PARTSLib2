// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.Utils.Interfaces;

import com.PARTS.Utils.sensors.LinearDistance;

import edu.wpi.first.math.geometry.Pose2d;

/** Add your docs here. */
public interface beanieDriveTrain {
    
    public void move(double speed, double speed2);

    public void moveVolts();

    public void moveArcade(double d, double output);

    public Pose2d currentPose();

    public double getAngle();

    public double getTurningRate();

    public LinearDistance leftDistance();

    public LinearDistance rightDistance();    

    public void stop();

    public EncoderValueInterface<?> getPersistentDistanceMeasureLeft();

    public EncoderValueInterface<?> getPersistentDistanceMeasureRight();

}
