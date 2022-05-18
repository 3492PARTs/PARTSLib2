// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.Utils.Interfaces;

/** Add your docs here. */
public interface EncoderValueInterface<T> {

public double getDistanceRaw();

public void setConversionFactor(double distPerRot);

public double getDistanceInches();

}
