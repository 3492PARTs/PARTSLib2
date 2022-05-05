// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.PARTS.Utils.Interfaces;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

/** Add your docs here. */
public class TalonSRXDistanceValue implements EncoderValueInterface<TalonSRX>{
    TalonSRX talonSRX;
    TalonSRXDistanceValue(TalonSRX talonSRX){
        this.talonSRX = talonSRX;
    }

    @Override
    public double getDistance() {

        return talonSRX.getSelectedSensorPosition();
    
    }

    @Override
    public double getVelocity() {
        // TODO Auto-generated method stub
        return talonSRX.getSelectedSensorVelocity();
    }
    
}
