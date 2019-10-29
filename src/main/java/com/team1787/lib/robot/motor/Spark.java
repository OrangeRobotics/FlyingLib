package com.team1787.lib.robot.motor;

import com.revrobotics.SparkMax;

public final class Spark extends MotorController<SparkMax> {

    private final SparkMax spark;

    public Spark(SparkMax spark) {
        this.spark = spark;
    }

    @Override
    public String getName() {
        return "SparkMax";
    }

    @Override
    public SparkMax getRawInstance() {
        return spark;
    }

    @Override
    public boolean isInverted() {
        return spark.getInverted();
    }

    @Override
    public void setInverted(boolean inverted) {
        spark.setInverted(inverted);
    }

    @Override
    public double get() {
        return spark.get();
    }

    @Override
    public void set(double speed) {
        spark.set(speed);
    }

    @Override
    public void disable() {
        spark.disable();
    }

    @Override
    public void stopMotor() {
        spark.stopMotor();
    }
}
