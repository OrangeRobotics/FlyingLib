package com.team1787.lib.robot.motor;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public final class Talon extends MotorController<WPI_TalonSRX> {

    private final WPI_TalonSRX talon;

    public Talon(WPI_TalonSRX talon) {
        this.talon = talon;
    }

    @Override
    public String getName() {
        return "TalonSRX";
    }

    @Override
    public WPI_TalonSRX getRawInstance() {
        return talon;
    }

    @Override
    public boolean isInverted() {
        return talon.getInverted();
    }

    @Override
    public void setInverted(boolean inverted) {
        talon.setInverted(inverted);
    }

    @Override
    public double get() {
        return talon.get();
    }

    @Override
    public void set(double speed) {
        talon.set(speed);
    }

    @Override
    public void disable() {
        talon.disable();
    }

    @Override
    public void stopMotor() {
        talon.stopMotor();
    }
}
